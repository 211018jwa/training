package com.revature.tests;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.revature.pages.StudentManagerHomePage;

public class StudentManagerTest {

	public WebDriver driver;
	public StudentManagerHomePage homepage;
	
	@BeforeEach
	public void setUp() {
		/*
		 * ARRANGE
		 */
		
		// Very common, basic interview question
		// How would you go about setting up Selenium such that we can navigate to the website we want to automate?
		
		// First step: specify the location of our chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers/chromedriver.exe");
		
		// Client interview question: How do you open the browser in incognito mode using Selenium?
		ChromeOptions options = new ChromeOptions(); // The ChromeOptions object gives us a lot of ability to customize what we are actually
		// doing with the automated browser that Selenium will control
		// For instance, I can specify that I want incognito mode to be on
		options.addArguments("--incognito"); // I am adding the incognito mode to what we should be using for the WebDriver
		
		// options.addArguments("--headless"); // headless mode, if I add it, will tell WebDriver not to open up the browser at all
		// It will instead run the browser in the background
		// This is especially useful if you are running E2E tests w/ Selenium on computers that do not have monitors (such as an EC2 instance)
		
		// Second step: instantiate the WebDriver object
		this.driver = new ChromeDriver(options); // WebDriver is an interface. ChromeDriver is an actual class
		// We are passing the ChromeOptions object into the ChromeDriver constructor for it to utilize this incognito mode
		
		/*
		 * Implicit wait: if we wanted to use implicit waits we would configure it for the driver object
		 */
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // an implicit wait is configured for the entire
		// Life of the WebDriver object
		
		// We are not explicitly specifying which elements we want to wait to appear, it will just automatically assume
		// that if we are looking for an element and it doesn't yet exist on the page, to actually just wait
		// So, implicit waits are essentially a "black box", because we don't really know what exactly is being waited on
		
		// Implicit waits are really easy, because we just need to configure it once and then forget about it
		// However, as a programmer, if somebody were to look at our automation code, they would have no idea if any elements are
		// actually being waited on
		// So, explicit waits are much more informative, because someone reading our code will know exactly which element is being
		// waited on
		// Most of the time, explicit waits are recommended over implicit waits for that reason.
		
		// Third step: navigate to the website we want to automate
		driver.get("http://student-management-app-1.s3-website.us-east-2.amazonaws.com");
		
		this.homepage = new StudentManagerHomePage(driver);
	}
	
	@AfterEach
	public void tearDown() {
		this.driver.quit(); // Best practice is to quit the WebDriver when you're done
	}
	
	@Test
	public void addStudentPositive() {
		/*
		 * ACT
		 */
		
		// Test case #1
		homepage.firstNameInput().sendKeys("tuv");
		homepage.lastNameInput().sendKeys("wux");
		homepage.classificationSelect().selectByVisibleText("Freshman");
		homepage.ageInput().sendKeys("21");
		
		
		// When we click on the add student button, the tr element we really want to find is the (number of tr elements before) + 1
		// At the time in which we click the button, it takes time for the frontend to update the table with the newly added student
		// So, if we try to locate this new element, it does not exist yet, and therefore we will get NoSuchElementException
		// The solution to this problem is to utilize Selenium waits
		homepage.addStudentButton().click();
		
		// There are two types of waits:
		// 1. Explicit
		// 2. Implicit
				
		// Find the td elements that exist within that tr element
		
		
		/*
		 * ASSERT
		 */
		List<WebElement> datacells = homepage.mostRecentlyAddedStudent().findElements(By.tagName("td"));
		
		// We are iterating over the td elements inside the most recent tr element to print out the information of the added student
		WebElement idTdElement = datacells.get(0); // id
		WebElement firstNameTdElement = datacells.get(1); // firstName
		WebElement lastNameTdElement = datacells.get(2); // lastName
		WebElement classificationTdElement = datacells.get(3); // classification
		WebElement ageTdElement = datacells.get(4); // age
		
		Assertions.assertEquals("tuv", firstNameTdElement.getText()); // expected, actual
		Assertions.assertEquals("wux", lastNameTdElement.getText()); // expected, actual
		Assertions.assertEquals("Freshman", classificationTdElement.getText()); // expected, actual
		Assertions.assertEquals("21", ageTdElement.getText()); // expected, actual
	}
	
	@Test
	public void testAddStudent_negativeAge_everythingElseValid() {
		/*
		 * ACT
		 */
		homepage.firstNameInput().sendKeys("abc");
		homepage.lastNameInput().sendKeys("def");
		homepage.classificationSelect().selectByVisibleText("Junior");
		homepage.ageInput().sendKeys("-10");
		
		homepage.addStudentButton().click();
		
		/*
		 * Assert
		 * 
		 * XPath that we will use:
		 * //div[@id='form-error-output']/p[text()='Age cannot be less than 0']
		 */
		Assertions.assertEquals("Age cannot be less than 0", homepage.negativeAgeErrorMessage().getText());
	}
	
}

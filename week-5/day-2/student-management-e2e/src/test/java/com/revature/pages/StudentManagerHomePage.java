package com.revature.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * The Page Object Model is a design pattern primarily used for Selenium automation
 * 
 * It allows us to create a class that represents as a blueprint for an object whose methods will return WebElements that represent a
 * particular page on a website
 * 
 * This way, we have a central location in which to update the locators for a page
 * This reduces duplication and promotes code reusability and cleanliness
 * 
 * For example, if we have 100 tests that utilize the same element, it is better to have the code that will find that particular element be in one centralized
 * location. For example, when the frontend is updated and the locator is no longer working, we only need to update the locator in the page object model class.
 */
public class StudentManagerHomePage {

	// Find the elements using locators
	// 1. id locator
	// 2. class locator
	// 3. name locator
	// 4. link text locator
	// 5. partial link text locator
	// 6. tag name locator
	
	// 7. CSS locator
	// 8. XPath locator
	
	private WebDriver driver;
	
	public StudentManagerHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement firstNameInput() {
		return driver.findElement(By.xpath("//input[@id='first-name']"));
	}
	
	public WebElement lastNameInput() {
		return driver.findElement(By.xpath("//input[@id='last-name']"));
	}
	
	public Select classificationSelect() {
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='classification']"));
		
		// The select object gives you methods to select
		// the different options in the dropdown
		Select classificationSelect = new Select(dropDownElement);
		
		return classificationSelect;
	}
	
	public WebElement ageInput() {
		return driver.findElement(By.xpath("//input[@id='age']"));
	}
	
	public WebElement addStudentButton() {
		return driver.findElement(By.xpath("//button[@id='student-submit']"));
	}
	
	public WebElement mostRecentlyAddedStudent() {
		/*
		 * Explicit Wait example
		 */
		int numberOfTrElements = driver.findElements(By.xpath("//div[@class='table-container']/table/tbody/tr")).size();
		
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(60)); 
		
		// If the amount of time we are waiting exceeds 10 seconds,
		// it will automatically fail by throwing a TimeoutException
		// It is important to note, that the waiting period is for a MAXIMUM of 60 seconds. But if the element is found before that,
		// it will continue to move on
		
		// Wait until the element is actually on the screen
		
		String mostRecentTrXpath = "//div[@class='table-container']/table/tbody/tr[" + (numberOfTrElements + 1) + "]";
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mostRecentTrXpath))); // The reason this is called
		
		// an explicit wait is that we are explicitly specifying what condition we want to wait for
		// The particular condition we are waiting for, is that the element that will be located by the xpath directly above
		// should be visible
		
		// Once the element is finally added to the page, we can then locate that element
		// if we try to locate this element
		// without doing a wait, the element does not yet exist immediately after we click the add button\
		// Therefore, we get NoSuchElementExeption without a wait
		return driver.findElement(By.xpath(mostRecentTrXpath));
	}
	
	public WebElement negativeAgeErrorMessage() {
		
		// Explicit wait
		WebDriverWait wdw = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		wdw.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='form-error-output']/p[text()='Age cannot be less than 0']")
						));
		
		return driver.findElement(By.xpath("//div[@id='form-error-output']/p[text()='Age cannot be less than 0']"));
	}
	
}

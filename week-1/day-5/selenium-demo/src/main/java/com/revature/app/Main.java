package com.revature.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// To start using Selenium WebDriver, we will need to specify the location of the webdriver file
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
		
		// Once we specify the location of the webdriver, we can instantiate a WebDriver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080"); // the get method will navigate us to the website
		
		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addBtn"));
		
		addInput1.sendKeys("10.5"); // type 10.5 into the first input element
		addInput2.sendKeys("15.3"); // type 15.3 into the second input element
		addButton.click(); // Click the button
		
		driver.switchTo().frame("addResult"); // Switch into the inside of the iframe
		WebElement addOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of this iframe
		System.out.println("The result of adding 10.5 and 15.3 is " + addOutput.getText()); // print out the text of the output element
		
		driver.switchTo().parentFrame(); // switch back outside of the iframe
		
		// sub
		
		// multiply
		
		// divide
		
		Thread.sleep(5000); // Pausing for 5 seconds
		// quit method
		// Whenever you are done with the scripted tasks that you provide to Selenium WebDriver, you should quit the driver
		// This is what will actually close the chromedriver.exe process, and free up the memory allocated to this process
		// So, this is actually an important step
		driver.quit();
	}

}

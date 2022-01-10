package com.revature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static ThreadLocal<WebDriver> driverFactory = new ThreadLocal<>();
	
	@BeforeMethod
	public void setupDriver() {
		WebDriverManager.chromedriver().setup(); // Automatically downloads and sets up ChromeDriver instead of needing to download
		// manually and use System.setProperty("webdriver.chrome.driver", "...")
		// Requires another dependency to be included into the project
		
		driverFactory.set(new ChromeDriver());
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDownDriver() {
		driverFactory.get().quit();
	}
	
}

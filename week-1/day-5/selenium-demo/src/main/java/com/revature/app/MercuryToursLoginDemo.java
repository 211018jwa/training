package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursLoginDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement usernameInput = driver.findElement(By.name("userName"));
		WebElement passwordInput = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("submit"));
		
		usernameInput.sendKeys("mercury");
		passwordInput.sendKeys("mercury");
		loginButton.click();
		
		WebElement signoffButton = driver.findElement(By.linkText("SIGN-OFF")); // linkText only works for a tags (which are tags for links on a page)
		
		Thread.sleep(5000); // wait for 5 seconds so we can see
		
		signoffButton.click();
		
		driver.quit();
	}

}

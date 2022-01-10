package com.revature;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends Base {

	
	// Data-driven framework is using external data to "drive" the tests
	
	@Test(dataProvider="validLogins")
	public void testValidLogin(String username, String password) { // hardcoded credentials
		// Go to website
		Base.driverFactory.get().get("https://www.saucedemo.com/");
		
		// Grab Elements
		WebElement usernameInput = Base.driverFactory.get().findElement(By.id("user-name"));
		WebElement passwordInput = Base.driverFactory.get().findElement(By.id("password"));
		WebElement loginButton = Base.driverFactory.get().findElement(By.id("login-button"));
		
		// Type in username and password
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginButton.click();
		
		// Assert for expected
		WebElement productsText = Base.driverFactory.get().findElement(By.xpath("//*[text()='Products']"));
		
		boolean productsTextIsDisplayed = productsText.isDisplayed();
		Assert.assertTrue(productsTextIsDisplayed);
	}
	
//	@Test(dataProvider="invalidLogins")
//	public void testInvalidLogins(String username, String password) {
//		
//	}
	
	@DataProvider(parallel=true) // name validLogins
	public Iterator<Object[]> validLogins() throws IOException {
		
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource("valid_logins.xlsx");
		File file = new File(resource.getFile());
		
		FileInputStream finput = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(finput);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		List<Object[]> logins = new ArrayList<>();
		
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			XSSFCell usernameCell = sheet.getRow(i).getCell(0);
			XSSFCell passwordCell = sheet.getRow(i).getCell(1);
			
			Object[] login = { usernameCell.getStringCellValue(),
					passwordCell.getStringCellValue() };
			
			logins.add(login);
		}
		
		return logins.iterator();
	}
	
	@DataProvider // name validLogins
	public Iterator<Object[]> invalidLogins() throws IOException {
		
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource("invalid_logins.xlsx");
		File file = new File(resource.getFile());
		
		FileInputStream finput = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(finput);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		List<Object[]> logins = new ArrayList<>();
		
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			XSSFCell usernameCell = sheet.getRow(i).getCell(0);
			XSSFCell passwordCell = sheet.getRow(i).getCell(1);
			
			Object[] login = { usernameCell.getStringCellValue(),
					passwordCell.getStringCellValue() };
			
			logins.add(login);
		}
		
		return logins.iterator();
	}
	
}

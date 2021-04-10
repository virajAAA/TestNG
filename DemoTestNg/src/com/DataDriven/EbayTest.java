package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void	 setUp() {
		System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
	}
	
	
	@Test
	public void ebayRegistrationPage() {
		
	}

	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}

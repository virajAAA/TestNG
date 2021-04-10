package com.DataDriver.Testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Xls_Reader reader =  new  Xls_Reader("C:\\Users\\admin\\git\\TestNG\\DemoTestNg\\src\\com\\TestData\\EbayData.xlsx");
		 
//			String firstName =  reader.getCellData("RegTest", "firstname", 2);
		String Firstname =  reader.getCellData("RegTest", 0, 2);
		System.out.println(Firstname);
//		
		String Lastname = reader.getCellData("RegTest", 1 , 2);
		System.out.println(Lastname);
		
		
		
//		
		WebDriver driver;	
		
		System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(Firstname);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(Lastname);

		
	}
		
	}



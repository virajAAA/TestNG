package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;

public class Parameterisec {

	public static void main(String[] args) {
		// WebDriver code
		
		 WebDriver driver;	
			
			System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		 //Data Driven approach using Excel file	
		 //get data from excel
		 Xls_Reader reader =  new  Xls_Reader("C:\\Users\\admin\\git\\TestNG\\DemoTestNg\\src\\com\\TestData\\EbayData.xlsx");
		 
		 int Rowcount =  reader.getRowCount("RegTest");
		 
		
		 //Add coloum metho
		 
		   reader.addColumn("RegTest", "Status");
		 
		 
		 
		 //Parameterization
		 for(int rowNum = 2; rowNum<=Rowcount; rowNum++)
		 {
			 String firstName = reader.getCellData("RegTest", 0 , rowNum);
			 
			 System.out.println(firstName);
			 
			 String lastName = reader.getCellData("RegTest", 1 , rowNum);
			 
			 System.out.println(lastName);
			 
			 driver.findElement(By.xpath("//*[@id=\"firstName\"]")).clear();
			 driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstName);
			 
			 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).clear();
			 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lastName);
			 
			 
			 //write the data into excel
			 reader.setCellData("RegTEst", "Status", rowNum, "Pass");
			
		 } 
		 
		
	}

}

package BasicNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

WebDriver driver;	
	
	@BeforeMethod
     public void setUp() {
		System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver.exe");
		 driver = new ChromeDriver(); //Launch Browser
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.google.com"); 
	}
	
	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Googl", "Title is not Match");
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

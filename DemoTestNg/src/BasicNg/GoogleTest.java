package BasicNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

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
	
	@Test(groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test(groups="Link Test")
	public void MailLink() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(groups=" Test")
	public void Test1() {
		System.out.println("Test one");
	}
	
	@Test(groups=" Test") 
	public void Test2() {
		System.out.println("Test two");
	}
	
	@Test(groups=" Test")
	public void Test3() {
		System.out.println("Test three");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

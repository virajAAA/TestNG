package BasicNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
 * 
setup system property for chrome
login into app
Launch chrome Browser
Enter URL
google Title test
Logout from Application
close chrome Browser
Delete all cookies
PASSED: googleTitleTest

*/

// Step by step Execution of the test cases.
/*
 * @BeforeMethod
 * @Test1
 * @AfterMethod
 * 
 * @BeforeMethod
 * @Test2
 * @AfterMethod
 * 
 * @BeforeMethod
 * @Test3
 * @AfterMethod
 * 
 * */
public class DemoTestng {

	 //Pre-conditions annotation -- starting with @Before
	
	 @BeforeSuite //  Execute 1
	 public void setUp() {
		 System.out.println("setup system property for chrome");
	 }
	 
	 @BeforeTest//  Execute 2  
	 public void launchBrowser() {
		 System.out.println("Launch chrome Browser");
	 }
	 
	 @BeforeClass// Execute 3  
	 public void login() {
		 System.out.println("login into app");
	 }

	 
	 @BeforeMethod//  Execute 4
	 public void enterURL() {
		 System.out.println("Enter URL");
	 }

/********************************************************************************************************/
	 // test case - Starting with Test
	 @Test//  Execute 5  
	 public void googleTitleTest() {
		 System.out.println("google Title test");
	 }	
	 
	 @Test
	 public void SearchTest() {
		 System.out.println("Search test");
	 }
	 
	 @Test
	 public void GoogleLogoTest() {
		 System.out.println("google logo test");
	 }
	 
/********************************************************************************************************/	 
	 //Post-conditions annotation -- starting with @After
	 @AfterMethod//  Execute 6
	 public void logOut() {
		 System.out.println("Logout from Application");
	 } 
	
	 
	 @AfterClass //  Execute 7
	 public void closeBrowser() {
		 System.out.println("close chrome Browser");
	 }
	 
	 @AfterTest//  Execute 8 
	 public void deleteAllCookies() {
		 System.out.println("Delete all cookies");
	 }
	 @AfterSuite//  Execute 9
	 public void generateTestReport() {
		 System.out.println("Generate Test Report");
	 }
}

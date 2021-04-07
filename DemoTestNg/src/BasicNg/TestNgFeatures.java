package BasicNg;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void LoginTest() {
		System.out.println("Login Test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods ="LoginTest")
	public void HomePageTest() {
		System.out.println("Home page Test");
	}
	
	@Test(dependsOnMethods ="LoginTest")
	public void AboutusTest() {
		System.out.println("About us page Test");
	}
	
	@Test(dependsOnMethods ="LoginTest")
	public void ProfileTest() {
		System.out.println("Profile Test");
	}
}
	

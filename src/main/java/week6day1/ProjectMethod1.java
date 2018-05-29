package week6day1;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import wdMethods.SeMethods;


public class ProjectMethod1 extends SeMethods {
	@BeforeMethod
	public void login() {
		startApp("chrome","https://www.paypal.com");
	}
	
	@AfterMethod
	public void closeapp() {
		closeBrowser();
	}
}



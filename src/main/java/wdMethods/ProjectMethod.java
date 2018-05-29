package wdMethods;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectMethod extends SeMethods {
	@BeforeMethod
	public void login() {
		startApp("chrome","http://leaftaps.com/opentaps/control/login");
		WebElement userName = locateElement("id", "username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
	}
	
	@AfterMethod
	public void closeapp() {
		closeBrowser();
	}
}

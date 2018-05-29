package week2dailyhw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class UnCheckBox {

	public static void main(String[] args) throws InterruptedException {  
		//Declaring class for chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//load url
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Web element for "i am selected" check box
		driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/input[2]").click();
		//Closing drivers
		driver.close();
	}

}

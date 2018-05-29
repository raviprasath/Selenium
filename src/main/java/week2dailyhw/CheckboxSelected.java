package week2dailyhw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelected {

	public static void main(String[] args) {

		// Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser size
		driver.manage().window().maximize();

		//Load url
		driver.get("http://leafground.com/pages/checkbox.html");

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Finding "I am selected" element and verifying is this selected or not 
		System.out.println("The 'I am Selected' checkbox is selected?: Answer is "+driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/input[2]").isSelected());	

		//Finding "VB" element and verifying is this selected or not 
		System.out.println("The 'VB' checkbox is selected?: Answer is "+driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/input[2]").isSelected());

		//Closing the driver
		driver.close();
	}

}

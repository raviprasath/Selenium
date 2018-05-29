package week9day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Paypal {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.paypal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("signup-button").click();
		
		WebElement radio = driver.findElementById("radio-personal");
		if(radio.isSelected())
			System.out.println("Shoppers radio button selected");
		else radio.click();

		driver.findElementByLinkText("Next").click();
		
		WebElement country = driver.findElementById("country");
		Select dd = new Select(country);
		dd.selectByVisibleText("India");
		
		driver.findElementById("email").sendKeys("mailtoravi@mailinator.com");
		
		driver.findElementById("password").sendKeys("Raviprasath@12");
		
		driver.findElementById("confirmPassword").sendKeys("Raviprasath@12");
		
		driver.findElementById("_eventId_personal").click();

		Thread.sleep(2000);
		
		driver.quit();
	}

}

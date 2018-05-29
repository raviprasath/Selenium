package week4day2project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("");
		driver.findElementById("pass").sendKeys("");
		driver.findElementByXPath("//label[@id='loginbutton']/input").click();
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		//driver.switchTo().alert().dismiss();
		driver.findElementByXPath("//div[@class='innerWrap']/div/input[2]").sendKeys("TestLeaf");
		driver.findElementByXPath("//div[@class='_585-']/form/button").click();
		Thread.sleep(3000);
		String like=driver.findElementByXPath("//div[@class='_3ko9']/span/button").getText();
		if(like.equalsIgnoreCase("Like"))
		{
			driver.findElementByXPath("//div[@class='_3ko9']/span/button").click();
		}
		driver.findElementByLinkText("TestLeaf").click();
		driver.findElementByXPath("//div[@class='_2fvv']/div[3]/a").click();
		System.out.println(driver.findElementByXPath("//div[@class='_4uyj']/div[2]").getText());
		
		
		
	}

}

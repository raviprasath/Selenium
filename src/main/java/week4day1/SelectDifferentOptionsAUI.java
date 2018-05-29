package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectDifferentOptionsAUI {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		
		Actions builder = new Actions(driver);
		//driver.getKeyboard().sendKeys(Keys.CONTROL);
		builder.sendKeys(Keys.CONTROL).click(item1).click(item3).click(item5).perform();
		/*builder.click(item1).release().perform();
		builder.click(item3).release().perform();
		builder.click(item5).release().perform();*/
		
		driver.close();
	}

}

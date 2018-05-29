package week5homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@id=\"search\"]/div/div[3]/div/label").click();
		List<WebElement> dates = driver.findElementsByXPath("//div[@class='rb-calendar']/table//td");

		int dateCount = dates.size();

		for(int i=0; i< dateCount ; i++) {
			String date = dates.get(i).getText();

			if(date.equalsIgnoreCase("4")) {
				dates.get(i).click();
				System.out.println("The date is selected");
				break;
			}

		}
		Thread.sleep(5000);
		driver.close();
	}

}

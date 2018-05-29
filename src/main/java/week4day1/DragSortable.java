package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragSortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement drag1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement drag3 = driver.findElementByXPath("//ul[@id='sortable']/li[3]");
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag1,0,drag3.getLocation().getY()).release().perform();

	}

}

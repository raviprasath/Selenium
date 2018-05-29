package week5day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeadNormal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("(//div[@id='label']/a)[1]").click();
		driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[4]").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("All Windows: "+allWindow.size());
		List<String> listOfWindow = new ArrayList<String>();
		listOfWindow.addAll(allWindow);
		driver.switchTo().window(listOfWindow.get(1));
		driver.findElementByXPath("(//div[@class='x-form-element'])[2]/input").sendKeys("Ravi");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(2000);
		WebElement id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = id.getText();
		id.click();
		driver.switchTo().window(listOfWindow.get(0));
		Thread.sleep(2000);
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> allwindow1 = driver.getWindowHandles();
		System.out.println("All windows: "+allwindow1.size());
		List<String> listOfWindow1 = new ArrayList<String>();
		listOfWindow1.addAll(allwindow1);
		Thread.sleep(2000);
		driver.switchTo().window(listOfWindow1.get(1));
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-form-element'])[2]/input").sendKeys("Ranjith");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(listOfWindow1.get(0));
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().accept();
		
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[3]").click();
		driver.findElementByXPath("(//input[@class=' x-form-text x-form-field'])[24]").sendKeys(text);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();		
		String text3 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if(text3.equalsIgnoreCase("No records to display"))
			System.out.println("The Lead merged successfully");
		else
			System.out.println("The Lead is not merged");
		
		driver.quit();
	}

}

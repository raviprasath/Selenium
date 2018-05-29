package week5day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadNormal {

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
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[3]").click();
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Ravi");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
		WebElement id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = id.getText();
		id.click();
		// int id1 = Integer.parseInt(text.replaceAll("\\D", ""));
		
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();	
		
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[3]").click();
		driver.findElementByXPath("(//input[@class=' x-form-text x-form-field'])[24]").sendKeys(text);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		
		String text2 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		if(text2.equalsIgnoreCase("No records to display"))
			System.out.println("The Lead deleted successfully");
		else
			System.out.println("The Lead is not deleted");
		driver.close();


	}

}

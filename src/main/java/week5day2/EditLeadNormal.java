package week5day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadNormal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("(//div[@id='label']/a)[1]").click();
		driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[3]").click();
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Ravi");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		
		driver.findElementById("updateLeadForm_description").sendKeys("Edit lead");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		
		Thread.sleep(2000);
		String text = driver.findElementById("viewLead_firstName_sp").getText();

		if(text.equalsIgnoreCase("Ravi"))
			System.out.println("Lead edited successful");
		else
			System.out.println("Lead not edited");

		driver.close();
	

	}

}

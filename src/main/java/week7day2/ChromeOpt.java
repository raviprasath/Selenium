package week7day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ChromeOpt {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-Infobar");
		op.addArguments("start-Maximized");
		op.setHeadless(true);	
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File snap = new File("./snaps/chrome.png");
		FileUtils.copyFile(screenshotAs,snap);

		driver.findElementByXPath("(//div[@id='label']/a)[1]").click();
		driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[2]").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ravi");
		driver.findElementById("createLeadForm_lastName").sendKeys("R");

		Select industry = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industry.selectByIndex(4);

		Select ownership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		ownership.selectByVisibleText("Partnership");

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9176506073");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();

		Thread.sleep(2000);
		String text = driver.findElementById("viewLead_firstName_sp").getText();

		if(text.equalsIgnoreCase("Ravi"))
			System.out.println("New Create Lead successful");
		else
			System.out.println("Not created new lead");

		driver.close();
	}
}
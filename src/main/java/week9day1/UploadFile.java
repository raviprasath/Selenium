package week9day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement ele = driver.findElementByXPath("//div[@id='uploadBtnCont']/input[1]");
		
		ele.sendKeys("C:\\Users\\vignesh\\Desktop\\ResumeCV.docx");
		
		driver.quit();
	}

}

package week3day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAndAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Input value");
		driver.switchTo().alert().accept();
		String inputValue = driver.findElementById("demo").getText();
		if (inputValue.contains("Input value")) {
			System.out.println("The given input value is matched");
		}
		else
		{
			System.out.println("The given input value is not matched");
		}
		WebElement drop = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(drop);
		List<WebElement> allOp = dd.getOptions();
		for (WebElement opname : allOp) {
			System.out.println(opname);
			
		}

		driver.close();


	}

}

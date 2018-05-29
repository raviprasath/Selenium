package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver;	
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser is Launched");
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("The Browser couldn't be opened");
		}

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				return	driver.findElementById(locValue);		
			case "name":
				return	driver.findElementByName(locValue);			
			case "class":
				return	driver.findElementByClassName(locValue);			
			case "link":
				return	driver.findElementByLinkText(locValue);			
			case "tag":
				return	driver.findElementByTagName(locValue);			
			case "xpath":
				return	driver.findElementByXPath(locValue);
			default:
				break;
			}
			return null;
		} catch (NoSuchElementException e) {
			// e.printStackTrace();
			System.err.println("The Element "+locator+" is not found");
		}
		finally
		{
			takeSnap();
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		try {
			return locateElement("id", locValue);
		} catch (NoSuchElementException e) {
			// e.printStackTrace();
			System.err.println("The Element"+locValue+" is not found");
		}
		finally
		{
			takeSnap();
		}
		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The Value is Entered");
		} catch (WebDriverException e) {
			// e.printStackTrace();
			System.err.println("The Element is not interacted");
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
		} catch (WebDriverException e) {
			// e.printStackTrace();
			System.err.println("The Element is not found or interacted");
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
		} catch (WebDriverException e) {
			//e.printStackTrace();
			System.err.println("The Element is not found or interacted");
		}
	}


	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
			System.out.println("The table "+ele+" Selected with "+value);
			takeSnap();
		} catch (NoSuchElementException e) {
			// e.printStackTrace();
			System.err.println("The element is not interacted");
		}finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele1, int index) {

		try {
			Select dd1 = new Select(ele1);
			dd1.selectByIndex(index);
			System.out.println("The table "+ele1+" Selected with "+index);
			takeSnap();
		} catch (NoSuchElementException e) {
			// e.printStackTrace();
		}finally {
			takeSnap();
		}
	}

	public boolean verifyTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("The expected title is same");
		}
		else 
			System.out.println("The expected title is not same");
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String value = ele.getText();
		if(value.equals(expectedText)) {
			System.out.println("The expected text is same");
			takeSnap();}
		else
			System.out.println("The expected text is not same");

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String value = ele.getText();
		if(value.contains(expectedText)) {
			System.out.println("The expected text is contain actual content");
			takeSnap();}
		else
			System.out.println("The expected text is not contain actual content");

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		String result = ele.getAttribute(attribute);
		if(result.equals(value))
		{
			System.out.println("The given attribute is match with expected one");
			takeSnap();
		}
		else
			System.out.println("The given attribute is not match with expected one");

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String result = ele.getAttribute(attribute);
		if(result.contains(value))
		{
			System.out.println("The given attribute is partially match with expected one");
			takeSnap();
		}
		else
			System.out.println("The given attribute is not partially match with expected one");

	}

	public boolean verifySelected(WebElement ele) {
		if(ele.isSelected()) {
			System.out.println("The Element is selected");
			return true;
		}
		else {
			System.out.println("The Element is not selected");
		}
		return false;
	}

	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed()) {
			System.out.println("The element is displayed");
			takeSnap();
		}
		else {
			System.out.println("The element is not displayed");
			takeSnap();
		}

	}

	public void switchToWindow(int index) {

		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("Total number of windows are: "+allwindow.size());

		List<String> listOfWindow = new ArrayList<String>();
		listOfWindow.addAll(allwindow);

		//String secWindow = listOfWindow.get(index);
		driver.switchTo().window(listOfWindow.get(index));

	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("The frame to be switched");

	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
		System.out.println("The alert box is accepted");
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		System.out.println("The alert box is dismissed");

	}

	public String getAlertText() {
		String value = driver.switchTo().alert().getText();
		System.out.println("The alert box text is: "+value);
		return value;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("The browser is closed");

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("All browsers closed");
		} catch (WebDriverException e) {
			// e.printStackTrace();
			System.err.println("");
		}

	}

	public String getText(WebElement ele) {
		try {
			String value = ele.getText();
			System.out.println("The element text is: "+value);
			return value;
		} catch (NoSuchElementException e) {
			//e.printStackTrace();
			System.err.println("The Element is not interactable");
		} finally {
			takeSnap();
		}
		return null;
	}



}

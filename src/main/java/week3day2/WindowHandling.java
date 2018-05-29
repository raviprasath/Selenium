package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("Total number of windows are: "+allwindow.size());
		
		List<String> listOfWindow = new ArrayList<String>();
		listOfWindow.addAll(allwindow);
		
		String secWindow = listOfWindow.get(1);
		driver.switchTo().window(secWindow);
	
		
		System.out.println("Second Window Url is "+driver.getCurrentUrl());
		
		driver.quit();
		
		

	}

}

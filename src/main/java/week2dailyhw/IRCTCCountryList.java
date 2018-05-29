package week2dailyhw;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCCountryList{

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//Printing screen
		int i=1;
		File src = driver.getScreenshotAs(OutputType.FILE);
		File disc = new File("./snaps/image"+i+".png");
		i++;
		try {
			FileUtils.copyFile(src, disc);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//Language dropdown
		List<WebElement> languageList= driver.findElementsById("userRegistrationForm:prelan");
				for(WebElement language:languageList)
		{
			String languageName=language.getText();
			System.out.println("Available languages are: "+languageName);
		}
				//Country dopdown 
		List<WebElement> countryDropdown = driver.findElementsById("userRegistrationForm:countries");
		for(WebElement eachDropdown: countryDropdown)
		{
			String countryName = eachDropdown.getText();
			System.out.println("The country name in dropdown field are " + countryName );

		}
		
		//Days dropdown
		List<WebElement> dayDropdown = driver.findElementsById("userRegistrationForm:dobDay");
		for(WebElement days:dayDropdown)
		{
			String dayList = days.getText();
			System.out.println("The days are: "+dayList);
		}
		
		//Nationality dropdown
		List<WebElement> nationality = driver.findElementsById("userRegistrationForm:nationalityId");
		for(WebElement countryName:nationality)
		{
			String nationalityCountryName = countryName.getText();
			System.out.println("The Nationality country names are: "+nationalityCountryName);
		}
		
		//Occupation 
		Select occupationDropdown = new Select(driver.findElementById("userRegistrationForm:occupation"));
		//occupationDropdown.selectByIndex(1);
		//occupationDropdown.selectByValue("0");
		occupationDropdown.selectByVisibleText("Government");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.close();
	}
}
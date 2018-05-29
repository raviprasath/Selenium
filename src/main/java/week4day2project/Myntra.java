package week4day2project;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser and disable the browser notifications
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);

		//Maximize the browser window
		driver.manage().window().maximize();

		//Launching the Myntra url
		driver.get("https://www.myntra.com/");

		//Implement the implicit wait to find the element
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchbar = driver.findElementByClassName("desktop-searchBar");

		//Enter the input in search field box and search it
		searchbar.sendKeys("sunglasses",Keys.ENTER);

		//Implement the wait time to find the element
		Thread.sleep(3000);

		//Stored WebElements value in List 
		List<WebElement> brandList = driver.findElementsByXPath("//div[@class='product-brand']");

		//Display the list size
		System.out.println("Total number of sunglasses brand count is "+brandList.size());

		//List converting to set that preventing duplicate value or displaying unique value  
		Set<String> brandSet=new TreeSet<String>();

		//add list object to set object
		for (WebElement brandName : brandList) {
			String brand = brandName.getText();
			brandSet.add(brand);
		}

		//Displaying unique Sunglasses brand
		System.out.println("Unique brand name list:"+brandSet);

		//Displaying unique Sunglasses brand size
		System.out.println("Total number of unique sunglasses brand count is "+brandSet.size());

		//Finding the list values for 40% off sunglasses 
		List<WebElement> discountList = driver.findElementsByXPath("//span[text()='(40% OFF)']/preceding::div[1]");

		//Finding the list values for 40% off sunglasses count
		System.out.println("40% OFF sunglasses count is "+discountList.size());

		//Finding the list values for unisex sunglasses
		List<WebElement> unisexProduct= driver.findElementsByXPath("//h4[text()[contains(.,'Unisex')]]");

		//Finding the list values for unisex sunglasses count
		System.out.println("Unisex sunglasess product count is "+unisexProduct.size());

		//Finding the list values for unisex sunglasses with discount and displaying the count
		List<WebElement> discountUnisexProduct= driver.findElementsByXPath("//span[text()='(40% OFF)']/preceding::h4[1][contains(text(), 'Unisex')]");
		System.out.println("40% OFF Unisex sunglasess product count is "+discountUnisexProduct.size());

		//Filter the green color sunglasses
		driver.findElementByXPath("(//label[@class='colour-label'])[4]").click();

		//Click on the second product from the search list
		driver.findElementByXPath("(//img[@class='product-thumb'])[2]").click();

		//Implement the wait time to find the WebElement
		Thread.sleep(3000);

		//Find the product heading and display the headline
		WebElement productName = driver.findElementByXPath("//h1[@class='pdp-title']");
		String prodname = productName.getText();
		System.out.println("The second green color sunglass product name is "+productName.getText());

		//Find the product price and covert the price into integer value to compare and display the price value
		WebElement productPrice = driver.findElementByXPath("//strong[@class='pdp-price']");
		String pr1 = productPrice.getText();
		int p1 = Integer.parseInt(pr1.replaceAll("\\D", ""));
		System.out.println("The second green color sunglass product price is "+p1);

		//Click on Add to bag button
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();

		//Click on Go to bag
		driver.findElementByXPath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button']").click();

		//Find the added product name and display
		WebElement greenProductName = driver.findElementByXPath("//a[@class='c-gray']");
		String greenproname = greenProductName.getText();
		System.out.println("Added product name is "+greenproname);

		//Find the added product price and covert the price to integer
		WebElement greenProductPrice = driver.findElementByXPath("//div[@class='c-dblue total-rupees']");
		String pr2 = greenProductPrice.getText();
		int p2 = Integer.parseInt(pr2.replaceAll("\\D", ""));
		System.out.println("Added product price "+p2);

		//compare the selected and added product name and price and display the result
		if(prodname.equals(greenproname) && p1==p2)
		{
			System.out.println("The selected product and added product name and price are same");
		}
		else
		{
			System.out.println("The selected product and added product name and price are not same");
		}

		//close the browser
		driver.close();


	}

}

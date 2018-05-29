package week4day2project;
		import java.util.ArrayList;
		import java.util.List;
		import java.util.Set;
		import org.junit.Test;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;

		public class Flipkart { 
			Actions builder;
			@Test
			public void run() throws InterruptedException {

				// Open browser 
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();

				//open flipkart site

				driver.get("https://www.flipkart.com");

				//close the login window

				driver.getKeyboard().sendKeys(Keys.ESCAPE);



				//mousehover on tv&appliance

				WebElement tvAppliance = driver.findElementByXPath("//span[text()='TVs & Appliances']");
				builder =new Actions(driver);
				builder.moveToElement(tvAppliance).release().perform();

				Thread.sleep(3000);

				//click samsung

				WebElement samsung = driver.findElementByXPath("(//span[text()='Samsung'])[2]");


				builder.click(samsung).release().perform();

				Thread.sleep(3000);

				//select min and max price values from drop down

				WebElement minPriceDD = driver.findElementByXPath("(//select[@class='a_eCSK'])[1]");

				Select priceDD1 =new Select(minPriceDD);

				priceDD1.selectByValue("25000");


				WebElement maxPriceDD = driver.findElementByXPath("(//select[@class='a_eCSK'])[2]");

				Select priceDD2 =new Select(maxPriceDD);

				priceDD2.selectByValue("60000");

				Thread.sleep(3000);

				//click on screensize

				WebElement screenSize = driver.findElementByXPath("(//div[text()='Screen Size'])[1]");

				builder.click(screenSize).release().perform();

				driver.findElementByXPath("//div[text()='48 - 55']").click();

				Thread.sleep(3000);
				//10-14

				//click on first product and get the price of the same

				/*List<WebElement> allPrice = driver.findElementsByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]");
				WebElement firstPrice = allPrice.get(0);*/
				WebElement firstPrice = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]");
				String p1 = firstPrice.getText();
				System.out.println("FIRST PRICE " + p1);
				WebElement tv = driver.findElementByXPath("(//div[@class='_1-2Iqu row']/div/div)[1]");
				tv.click();
				/*ilder.click(tv).perform();
			    Thread.sleep(3000);*/
				//switch to second window

				Set<String> allWindows = driver.getWindowHandles();
				List<String> listofWindow = new ArrayList<String>();
				listofWindow.addAll(allWindows);
				String secWindow = listofWindow.get(1);
				driver.switchTo().window(secWindow);

				//get price from second window

				WebElement price = driver.findElementByXPath("//div[@class='_1vC4OE _37U4_g']");
				String priceValue = price.getText();
				System.out.println("PRICE" + priceValue);
				//s  Thread.sleep(millis);
				if(priceValue.equalsIgnoreCase(p1) )
				{
					System.out.println("PRICE VALUE MATCHES");
					driver.close();
				}



				driver.switchTo().window(listofWindow.get(0));
				System.out.println(driver.getTitle());
				Thread.sleep(3000);

				/*WebElement flip = driver.findElementByXPath("//img[@title='Flipkart']");
				Actions act = new Actions(driver);
				act.moveToElement(flip).perform();

				builder.moveToElement(flip).release().perform();*/

				//15-20
				WebElement ad1 = driver.findElementByXPath("(//span[@class='_1nUZxV']//input)[1]");

				builder.moveToElement(ad1).click(ad1).release().perform();
				Thread.sleep(2000);
				WebElement ad2 = driver.findElementByXPath("(//span[@class='_1nUZxV']//input)[2]");

				builder.moveToElement(ad2).click(ad2).release().perform();




				WebElement compare = driver.findElementByXPath("//span[text()='COMPARE']");  //Click on the COMPARE button at end of the page
				compare.click();
				//builder.click(compare);
				WebElement compareText = driver.findElementByXPath("//span[text()='COMPARE']"); // Read the Text of the Compare Window screen of the two items selected 
				System.out.println(compareText.getText()+ "is the Section Title");
				Thread.sleep(3000);

				WebElement item1 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[1]");
				String item1Price = item1.getText();

				WebElement item2 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[2]");
				String item2Price = item2.getText();

				//Get only the price value from the String Text value
				String price1 = item1Price.replaceAll("\\D", "");
				System.out.println("price item 1 "+ price1);
				String price2 = item2Price.replaceAll("\\D", "");
				System.out.println("price item 2 "+ price2);

				//Convert the string to Integer value
				int item1Val = Integer.parseInt(price1);
				int item2Val = Integer.parseInt(price2);

				//Find out the lesser Price item
				if(item1Val<item2Val)
					System.out.println(item1Val + " Price of item 1 is less ");
				else 
					System.out.println(item2Val + " Price of item 2 is less ");

	}

}

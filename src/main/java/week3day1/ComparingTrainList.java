package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingTrainList {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement fromStation = driver.findElementById("txtStationFrom");
		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.TAB);
		WebElement toStation = driver.findElementById("txtStationTo");
		toStation.clear();
		toStation.sendKeys("SBC",Keys.TAB);
		driver.findElementById("buttonFromTo").click();
		//Getting train names

		List<WebElement> trainList = driver.findElementsByXPath("//table[@class='DataTable TrainList']/tbody//tr/td[2]");

		List<String> trainList1 = new ArrayList<String>();

		for (WebElement train: trainList) {
			trainList1.add(train.getText());
		}		

		TreeSet<String> trainListSet = new TreeSet<String>(trainList1);
		System.out.println("Chennai to Bangalore available train lists are: "+trainList1);
		System.out.println("Trains count is "+trainList1.size());
		System.out.println("Chennai to Bangalore available train lists are: "+trainListSet);

		//Click on Train list and get the train names

		Thread.sleep(3000);
		driver.findElementByXPath("//div[@id=\'divTrainsListHeader']/table/tbody/tr/td[2]/a").click();

		List<WebElement> trainListDown = driver.findElementsByXPath("//table[@class='DataTable TrainList']/tbody//tr/td[2]");

		List<String> trainListDown1 = new ArrayList<String>();

		for (WebElement train1 : trainListDown) {
			trainListDown1.add(train1.getText());
		}

		TreeSet<String> trainListSet1 = new TreeSet<String>(trainListDown1);
		System.out.println("Chennai to Bangalore available train lists from down are: "+trainListDown1);
		System.out.println("Trains count is "+trainListDown1.size());
		System.out.println("Chennai to Bangalore available train lists from down are: "+trainListSet1);


		if(trainListSet1.equals(trainListSet))
			System.out.println("The searched and re-searched train lists are same");
		else
			System.out.println("The searched and re-searched train lists are not same");

		driver.close();
		
	}
	}
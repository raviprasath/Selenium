package week5day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethod;

public class MergeLead extends ProjectMethod{
@Test(timeOut=40000)
	public void mergelead(){
		
		login();
		click(locateElement("link", "CRM/SFA"));
		WebElement leads = locateElement("link", "Leads");
		click(leads); 	
		click(locateElement("link","Merge Leads"));
		
		/*click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("name", "firstName"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		Thread.sleep(2000);
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("name", "firstName"), "Babu");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);		
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		
		click(locateElement("link", "Merge"));
		acceptAlert();
		
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), txt);
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");
*/		
		closeBrowser();

	}

}

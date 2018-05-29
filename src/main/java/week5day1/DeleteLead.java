package week5day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethod;

public class DeleteLead extends ProjectMethod {
	@Test(dependsOnMethods= {"week5day1.CreateLead.createlead"})
	public void deleteLead() throws InterruptedException {
		login();
		click(locateElement("link", "CRM/SFA"));
		WebElement leads = locateElement("link", "Leads");
		click(leads); 	
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Ranjith");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(3000);
		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("link", "Delete"));
		
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), txt);
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");
		closeBrowser();
	}

	
}

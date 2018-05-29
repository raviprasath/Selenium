package week5day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethod;

public class EditLead extends ProjectMethod {
	@Test(dependsOnMethods= {"week5day1.CreateLead.createlead"})
	public void editlead() {
		login();
		click(locateElement("link", "CRM/SFA"));
		WebElement leads = locateElement("link", "Leads");
		click(leads); 	
		WebElement findLeads = locateElement("link","Find Leads");
		click(findLeads);
		type(locateElement("id", "ext-gen248"), "Ranjith");
		type(locateElement("id", "ext-gen250"), "Babu");
		type(locateElement("id", "ext-gen252"), "SQS");
		WebElement findLead = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
		click(findLead);
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("link", "Edit"));
		type(locateElement("id", "updateLeadForm_description"),"Edit Lead");
		click(locateElement("class", "smallSubmit"));
		closeBrowser();
	}
}

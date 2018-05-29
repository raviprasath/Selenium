package week5day1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethod;

public class CreateLead extends ProjectMethod{
@Test(invocationCount=2)
	public void createlead() {
		login();
	    click(locateElement("link", "CRM/SFA"));
		WebElement leads = locateElement("link", "Leads");
		click(leads); 	 
		click(locateElement("link", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "SQS");
		type(locateElement("id", "createLeadForm_firstName"), "Ranjith");
		type(locateElement("id", "createLeadForm_lastName"), "Babu");
		WebElement dropdown = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(dropdown, "Conference");
		click(locateElement("name", "submitButton"));
		closeBrowser();
	}

}

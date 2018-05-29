 package week3day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MethodCalling extends SeMethods {
@Test
	public  void createLead()  {
	
 	startApp("chrome","http://leaftaps.com/opentaps");
 	WebElement userName = locateElement("id", "username");
 	type(userName, "DemoSalesManager");
 	WebElement passWord = locateElement("id", "password");
 	type(passWord, "crmsfa");
 	WebElement login = locateElement("class", "decorativeSubmit");
 	click(login);
    click(locateElement("link", "CRM/SFA"));
  	WebElement leads = locateElement("link", "Leads");
	click(leads); 	 
	 click(locateElement("link", "Create Lead"));
	 type(locateElement("id", "createLeadForm_companyName"), "SQS");
	 type(locateElement("id", "createLeadForm_firstName"), "Ranjith");
	 type(locateElement("id", "createLeadForm_lastName"), "Babu");
	 
	 WebElement dropdown = locateElement("id", "createLeadForm_dataSourceId");
	 selectDropDownUsingText(dropdown, "Conference");
	 
	 WebElement dropdown1 = locateElement("id", "createLeadForm_ownershipEnumId");
	 selectDropDownUsingIndex(dropdown1, 3);
	 
	 click(locateElement("name", "submitButton"));
	}

}

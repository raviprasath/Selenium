package week5day2;

import org.testng.annotations.Test;
import wdMethods.ProjectMethod;

public class CreateLeadSEMethod extends ProjectMethod{
	@Test
	public void createLeadSEMethod() throws InterruptedException{
		login();
		click(locateElement("xpath","(//div[@id='label']/a)[1]"));
		
		click(locateElement("xpath","(//div[@class='x-panel-header'])[2]"));
		
		click(locateElement("xpath","//div[@class='frameSectionBody']/ul/li[2]"));
		
		type(locateElement("id", "createLeadForm_companyName"), "TCS");
		type(locateElement("id", "createLeadForm_firstName"), "Ravi");
		type(locateElement("id", "createLeadForm_lastName"), "R");
		
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_industryEnumId"), 4);
		selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), "Partnership");
		type(locateElement("id","createLeadForm_primaryPhoneNumber"),"9176506073");
		
		click(locateElement("xpath","//input[@class='smallSubmit']"));
		Thread.sleep(2000);
		
		String text = locateElement("id", "viewLead_firstName_sp").getText();

		if(text.equalsIgnoreCase("Ravi"))
			System.out.println("New Create Lead successful");
		else
			System.out.println("Not created new lead");
		
		closeapp();

	}

}

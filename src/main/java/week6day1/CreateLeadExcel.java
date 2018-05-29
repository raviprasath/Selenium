package week6day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class CreateLeadExcel {
	public class CreateLeadParameter extends ProjectMethod1 {
		
		@BeforeClass
		public void excelSheet() {
			excelFilename = "TC001";
		}
		
		@Test(dataProvider = "fetchdata")
		public void createLeadParameter(String company, String fName, String lName, String mobileNumber) throws InterruptedException{
			click(locateElement("xpath","(//div[@id='label']/a)[1]"));
			click(locateElement("xpath","(//div[@class='x-panel-header'])[2]"));
			click(locateElement("xpath","//div[@class='frameSectionBody']/ul/li[2]"));
			type(locateElement("id", "createLeadForm_companyName"), company);
			type(locateElement("id", "createLeadForm_firstName"), fName);
			type(locateElement("id", "createLeadForm_lastName"), lName);
			selectDropDownUsingIndex(locateElement("id", "createLeadForm_industryEnumId"), 4);
			selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), "Partnership");
			type(locateElement("id","createLeadForm_primaryPhoneNumber"), mobileNumber);
			click(locateElement("xpath","//input[@class='smallSubmit']"));
			Thread.sleep(2000);
			String text = locateElement("id", "viewLead_firstName_sp").getText();

			if(text.equalsIgnoreCase("Ravi"))
				System.out.println("New Create Lead successful");
			else
				System.out.println("Not created new lead");
		}
	}
}

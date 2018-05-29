package week6day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethod;

public class CreateLeadDataProvider {
	public class CreateLeadParameter extends ProjectMethod {
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
@DataProvider(name = "fetchdata")
		public Object[][] getData() {
			Object[][] data = new Object[2][4];

			data[0][0] = "TCS";
			data[0][1] = "Ravi";
			data[0][2] = "Prasath";
			data[0][3] = "9176506073";

			data[1][0] = "TCS";
			data[1][1] = "Ravi";
			data[1][2] = "R";
			data[1][3] = "9176506073";
			
			return data;
		}
	}
}
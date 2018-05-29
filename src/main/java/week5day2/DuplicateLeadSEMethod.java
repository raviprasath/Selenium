package week5day2;

import org.testng.annotations.Test;
import wdMethods.ProjectMethod;

public class DuplicateLeadSEMethod extends ProjectMethod{
	@Test	
	public void duplicateLeadSEMethod() throws InterruptedException {
		login();
		click(locateElement("xpath","(//div[@id='label']/a)[1]"));
		click(locateElement("xpath","(//div[@class='x-panel-header'])[2]"));
		click(locateElement("xpath","//div[@class='frameSectionBody']/ul/li[3]"));
		type(locateElement("xpath","(//div[@class='x-form-element']/input)[14]"),"Ravi");
		click(locateElement("xpath","(//button[@class='x-btn-text'])[7]"));
		Thread.sleep(2000);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath","(//a[@class='subMenuButton'])[1]"));
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		Thread.sleep(2000);
		String text = locateElement("id", "viewLead_firstName_sp").getText();

		if(text.equalsIgnoreCase("Ravi"))
			System.out.println("Duplicate Lead created successful");
		else
			System.out.println("Not created duplicate lead");

		closeapp();

	}

}

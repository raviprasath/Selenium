package week5day2;

import org.testng.annotations.Test;
import wdMethods.ProjectMethod;

public class MergeLeadSEMethod extends ProjectMethod{
	@Test
	public void mergeLeadSEMethod() throws InterruptedException {
		login();
		click(locateElement("xpath","(//div[@id='label']/a)[1]"));
		click(locateElement("xpath","(//div[@class='x-panel-header'])[2]"));
		click(locateElement("xpath","//div[@class='frameSectionBody']/ul/li[4]"));
		click(locateElement("xpath","(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath", "(//div[@class='x-form-element'])[2]/input"),"Ravi");
		click(locateElement("xpath","(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(2000);
		String text = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		Thread.sleep(2000);
		click(locateElement("xpath","(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "(//div[@class='x-form-element'])[2]/input"),"Ranjith");
		click(locateElement("xpath","(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(2000);
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		Thread.sleep(2000);
		click(locateElement("xpath","//a[@class='buttonDangerous']"));
		acceptAlert();
		click(locateElement("xpath","//div[@class='frameSectionBody']/ul/li[3]"));
		type(locateElement("xpath", "(//input[@class=' x-form-text x-form-field'])[24]"),text);
		click(locateElement("xpath","(//button[@class='x-btn-text'])[7]"));


		String text3 = locateElement("xpath","//div[@class='x-paging-info']").getText();
		if(text3.equalsIgnoreCase("No records to display"))
			System.out.println("The Lead merged successfully");
		else
			System.out.println("The Lead is not merged");

		closeapp();

	}
}

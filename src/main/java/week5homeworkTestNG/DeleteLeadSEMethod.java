package week5homeworkTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.ProjectMethod;

public class DeleteLeadSEMethod extends ProjectMethod {
	@Test(dependsOnMethods = "week5homeworkTestNG.CreateLeadSEMethod.createLeadSEMethod")
	public void deleteLeadSEMethod() throws InterruptedException {
		login();
		click(locateElement("xpath","(//div[@id='label']/a)[1]"));
		click(locateElement("xpath","(//div[@class='x-panel-header'])[2]"));
		click(locateElement("xpath","//div[@class='frameSectionBody']/ul/li[3]"));
		type(locateElement("xpath","(//div[@class='x-form-element']/input)[14]"),"Ravi");
		click(locateElement("xpath","(//button[@class='x-btn-text'])[7]"));
		Thread.sleep(2000);
		WebElement id = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = id.getText();
		click(id);
		// int id1 = Integer.parseInt(text.replaceAll("\\D", ""));
		click(locateElement("xpath", "//a[@class='subMenuButtonDangerous']"));
		click(locateElement("xpath","//div[@class='frameSectionBody']/ul/li[3]"));		
		type(locateElement("xpath","(//input[@class=' x-form-text x-form-field'])[24]"),text);
		click(locateElement("xpath","(//button[@class='x-btn-text'])[7]"));
		String text2 = locateElement("xpath","//div[@class='x-paging-info']").getText();
		if(text2.equalsIgnoreCase("No records to display"))
			System.out.println("The Lead deleted successfully");
		else
			System.out.println("The Lead is not deleted");
		closeapp();
	}

}

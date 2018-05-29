package week5day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args)  throws IOException{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extents = new ExtentReports();
		extents.attachReporter(html);
		
		ExtentTest test = extents.createTest("TC001_Create Lead", "Create a new lead");
		
		test.pass("The username entered successfully");
		
		test.pass("The password entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		
		test.fail("The button is not clickable");
	
		test.assignAuthor("Ravi");
		test.assignCategory("Smoke");
		
		extents.flush();

	}

}

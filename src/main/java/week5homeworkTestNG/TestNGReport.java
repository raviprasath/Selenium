package week5homeworkTestNG;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNGReport {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result1.html");
		html.setAppendExisting(false);
		
		ExtentReports extents = new ExtentReports();
		extents.attachReporter(html);
		
		ExtentTest test = extents.createTest("TC001_Create Lead", "Create a new Lead");
		test.assignAuthor("Ravi");
		test.assignCategory("Testing");
		
		test.pass("Create lead passed");
		test.fail("Create Lead not created");
		
		test.pass("Create lead is created", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		
		extents.flush();

	}

}

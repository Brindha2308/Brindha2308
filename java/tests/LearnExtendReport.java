package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {
public static void main(String[] args) {
	
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/results");
	
	ExtentReports extent=new ExtentReports();
	
	extent.attachReporter(reporter);
	
	ExtentTest test=extent.createTest("Create Lead", "Create lead with mandatory fields");
	test.assignAuthor("Brindha");
	test.assignCategory("Smoke");
	test.pass("Enter UserName");
	test.pass("Enter Password");
	test.pass("Click Login");
	extent.flush();
}
}

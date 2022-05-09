package runner;

import org.testng.annotations.AfterClass;

import baseclass.JvmReport;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\NOLAN\\eclipse-workspace\\New folder\\ParabankRegistering\\src\\test\\resources\\Feature"
,glue= "stepdefinitions",dryRun=false,monochrome=false,plugin= {"html:src\\test\\resources\\Reports\\parabank.html",
		"json:src\\test\\resources\\Reports\\parabank.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void After() {
	JvmReport.Report(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\parabank.json");	
	}


}

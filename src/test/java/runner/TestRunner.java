package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\NOLAN\\eclipse-workspace\\TestNgTable\\src\\test\\resources\\Feature"
,glue= "stepdefinitions",dryRun=false,monochrome=false,plugin= {"html:src\\test\\resources\\Reports\\parabank.html",
		"json:src\\test\\resources\\Reports\\parabank.json"})
public class TestRunner extends AbstractTestNGCucumberTests {


}

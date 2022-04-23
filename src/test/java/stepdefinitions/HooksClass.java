package stepdefinitions;

import baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public void BeforeExecution() {
		LaunchChrome();
	    LoadUrl("https://parabank.parasoft.com/");
	    WindowMaximize();
		
	}
	@After
	public void AfterExecution() {
		quit();
	}

}

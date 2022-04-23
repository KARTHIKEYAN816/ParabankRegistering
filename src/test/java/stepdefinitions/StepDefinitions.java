package stepdefinitions;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.YourHomePage;

public class StepDefinitions extends BaseClass {
	BaseClass b=new BaseClass();
	YourHomePage y=new YourHomePage();

	@Given("User launch Parabank Home Page")
	public void user_launch_parabank_home_page() {
		
	}
	@Then("User verifies Home Page is Displayed")
	public void user_verifies_home_page_is_displayed() {
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(b.GetText(y.getHomePageVerification()), "Experience the difference"); //"Experience the difference");
	   soft.assertAll();
		
	}
	@When("User Clicks Register Button")
	public void user_clicks_register_button() {
		b.BtnClick(y.getRegister());
	    
	}
	@Then("User Enters FirstName,LastName,Address,City,State,ZipCode,PhoneNum,SSn,UserName,Password,Confirm And Clicks Register Button")
	public void user_enters_first_name_last_name_address_city_state_zip_code_phone_num_s_sn_user_name_password_confirm_and_clicks_register_button() throws IOException, InterruptedException {
	  b.Wait();
		
		b.SendKeys(y.getFirstName(), b.GetExcelData("Sheet1", 0, 1));
		b.SendKeys(y.getLastName(), b.GetExcelData("Sheet1", 1, 1));
		b.SendKeys(y.getAddress(), b.GetExcelData("Sheet1",2 , 1));
		b.SendKeys(y.getCity(), b.GetExcelData("Sheet1", 3, 1));
		b.SendKeys(y.getState(), b.GetExcelData("Sheet1", 4, 1));
		b.SendKeys(y.getZipcode(), b.GetExcelData("Sheet1", 5, 1));
		b.SendKeys(y.getPhonenum(), b.GetExcelData("Sheet1", 6, 1));
		b.SendKeys(y.getSsn(), b.GetExcelData("Sheet1", 7, 1));
		b.SendKeys(y.getUsername(), b.GetExcelData("Sheet1", 8, 1));
		b.SendKeys(y.getPassword(), b.GetExcelData("Sheet1", 9, 1));
		b.SendKeys(y.getConfirm(), b.GetExcelData("Sheet1", 10, 1));
		b.BtnClick(y.getSubmit());
		
	}
	@Then("User Verifies Sucessful Account Creation")
	public void user_verifies_sucessful_account_creation() throws InterruptedException {
		b.Wait();
	    b.verification(y.getCreation(), "Your account was created");
		
	}



}

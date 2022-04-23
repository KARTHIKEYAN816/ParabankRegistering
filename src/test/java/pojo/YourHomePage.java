package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class YourHomePage extends BaseClass {
	public  YourHomePage() {
		PageFactory.initElements(driver, this);
		
}
@FindBy(css=".caption")
private WebElement HomePageVerification;
@FindBy(xpath="//*[@id=\"loginPanel\"]/p[2]/a")
private WebElement Register;
@FindBy(css="input[name*='firstName']")
private WebElement FirstName;
@FindBy(css="input[name*='lastName']")	
private WebElement LastName;
@FindBy(css="input[name*='address.street']")
private WebElement Address;
@FindBy(css="input[id*='customer.address.city']")
private WebElement city;
@FindBy(css="input[name*='state']")
private WebElement state;
@FindBy(css="input[name*='zipCode']")
private WebElement zipcode;
@FindBy(css="input[name*='phone']")
private WebElement phonenum;
@FindBy(css="input[name*='ssn']")
private WebElement ssn;
@FindBy(xpath="(//input[contains(@name,'username')])[2]")
private WebElement username;
@FindBy(xpath="(//input[contains(@name,'password')])[2]")
private WebElement password;
@FindBy(xpath="//input[contains(@name,'repeat')]")
private WebElement confirm;
@FindBy(css="input[type*='submit'][value^='Re']")
private WebElement submit;
@FindBy(xpath="(//p)[3]")
private WebElement creation;

public WebElement getHomePageVerification() {
	return HomePageVerification;
}
public WebElement getCreation() {
	return creation;
}
public WebElement getRegister() {
	return Register;
}
public WebElement getFirstName() {
	return FirstName;
}
public WebElement getLastName() {
	return LastName;
}
public WebElement getAddress() {
	return Address;
}
public WebElement getCity() {
	return city;
}
public WebElement getState() {
	return state;
}
public WebElement getZipcode() {
	return zipcode;
}
public WebElement getPhonenum() {
	return phonenum;
}
public WebElement getSsn() {
	return ssn;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getConfirm() {
	return confirm;
}
public WebElement getSubmit() {
	return submit;
}
}

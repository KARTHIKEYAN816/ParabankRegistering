Feature: Login Validation of ParaBank Page
Scenario: Registering a new Account
Given User launch Parabank Home Page
Then User verifies Home Page is Displayed
When User Clicks Register Button
Then User Enters FirstName,LastName,Address,City,State,ZipCode,PhoneNum,SSn,UserName,Password,Confirm And Clicks Register Button
Then User Verifies Sucessful Account Creation

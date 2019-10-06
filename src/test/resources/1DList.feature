
Feature: Checks the customer registration functionality

 Scenario: Verify that the customer can able to enter the details in the registration page.
	 Given User is on amazon page
    When User clicks the create your account 
    When User enters the username, mobile no and the email address
    |Divakar17|8939688208|divakarganesh10@gmail.com|
    When User enters the Password and re-enters the Password 
   	|Fonature@123|
    And  the user clicks the create your amazon account.
    Then the customer navigates to home page.

 
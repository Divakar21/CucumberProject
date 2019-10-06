
Feature: Checks the customer registration functionality

  Scenario: Verify that the user can able to add the customer details in the guru99 telecom page
   Given User is on guru telecom page
   When User enters the firstName,lastName,email Address,address location and mobileno
   	|firstName|lastName|Email|Address|MobileNo|
   	|Divakar|Muthu|xyz@gmail.com|test|9784546542|
   	|Saravana|kumar|abc@gmail.com|test|9004546578|
   And the user clicks the submit option
   Then customer can able to see the generated customer id.
   
   
   
   	
   
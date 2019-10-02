Feature: Checks the customer registration functionality
 
  
  Scenario: Verify that the user can able to add the customer details in the guru99 telecom page
    Given User is in demo guru telecom page
    When User clicks the add customer tab and enters the FirstName and LastName 
   	When User enters the Email Id and the address location
    When User enters the Mobile Number 
    And User clicks the submit button
    Then the customer id is generated succesfully.
    



	 
   

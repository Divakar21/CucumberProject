Feature: Customer registration functionality
  
  Scenario: Verify that the user can able to add the customer details in the guru99 telecom page
   	Given User is on demoguru telecom page
    When User enters the FirstName and LastName
    |Divakar|Muthu|
    |Vishal|Easwar|
   	When User enters the Email Address and the address location
   	|divakarganesh21@gmail.com|test|
   	|vishaleaswar14@gmail.com|test|
    When User enters the Mobile No and the user clicks the submit button
    |7904798321|
    |8939588207|
    Then the customer gets the confirmation message

 
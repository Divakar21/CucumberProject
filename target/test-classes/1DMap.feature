
Feature: Checks the customer registration functionality
  
  Scenario:  Verify that the user can able to add the customer details in the guru99 telecom page
    Given The user is on demoguru telecom page
    When User enters the FirstName,LastName,Email Address and the address location
    |firstName|Divakar|
    |lastName|Muthu|
    |Email|abc123@gmail.com|
    |Address|abc|
    When the user enters the Mobile No and the user clicks the submit button
    |MobileNo|9005245478|
    Then the user can able to see the customer id generated.

 
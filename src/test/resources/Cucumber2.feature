Feature: Checks the customer registration functionality

Scenario Outline: Verify that the user can able to add the customer details in the guru99 telecom page
	 	Given User is on demo guru telecom page
	 	When User enters the telecom tab and clicks the add customer.
    When User enters the FirstName and LastName"<fname>","<lname>"
   	When User enters the Email Address and the address location"<email>","<address>"
    When User enters the Mobile No"<mobileno>" 
    And  the user clicks the submit button
    Then the customer gets the successful message
    
    Examples:
    |fname||lname||email||address||mobileno|
		|Divakar||Muthu||divakarganesh21@gmail.com||No 10 United Colony Chennai||9791148956|
		|Vishal||Easwar||vishaleaswar14@gmail.com||No 12 Sairam Nagar Chennai||8618843241|
		
		
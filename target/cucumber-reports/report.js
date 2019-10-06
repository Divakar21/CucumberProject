$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/Downloads/eclipse/Divakar/CucumberFramework/src/test/resources/Login.feature");
formatter.feature({
  "name": "Checks the customer registration functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that the user can able to add the customer details in the guru99 telecom page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is in demo guru telecom page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_demo_guru_telecom_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the add customer tab and enters the FirstName and LastName",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_FirstName_and_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Email Id and the address location",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Email_Id_and_the_address_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Mobile Number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_Mobile_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer id is generated succesfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_customer_id_is_generated_succesfully()"
});
formatter.result({
  "status": "passed"
});
});
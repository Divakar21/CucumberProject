package org.test.steps;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.test.objectrepository.LoginPage;
import org.test.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition8 extends Base {
		WebDriver driver = Hooks.driver;
		LoginPage page;
		@Given("User is on demo guru telecom page")
		public void user_is_on_demo_guru_telecom_page() throws InterruptedException {
		loadUrl("http://demo.guru99.com/");
		Thread.sleep(2000);
		}

		@When("User enters the FirstName and LastName{string},{string}")
		public void user_enters_the_FirstName_and_LastName(String a, String b) {
			page = new LoginPage();
			btnClick(page.getTelecomClick());
			btnClick(page.getAddCustomerClick());
			btnClick(page.getBackgroundClick());
			setText(page.getTxtFirstName(),a);
			setText(page.getTxtLastName(),b);
		}

		@When("User enters the Email Address and the address location{string},{string}")
		public void user_enters_the_Email_Address_and_the_address_location(String s1, String s2) {
			 setText(page.getTxtEmailAddress(),s1);
			 setText(page.getTxtAddress(),s2);
		}

		@When("User enters the Mobile No{string}")
		public void user_enters_the_Mobile_No(String s) {
			setText(page.getTxtMobileNo(),s);
		}

		@When("the user clicks the submit button")
		public void the_user_clicks_the_submit_button() {
			btnClick(page.getSubmitClick());
		}

		@Then("the customer gets the successful message")
		public void the_customer_gets_the_successful_message() {
			getText(page.getTxtGuruTelecom());
			Scanner sn = new Scanner(System.in);
			System.out.println("Enter the customer id");
			int n = sn.nextInt();
			if(getText(page.getTxtGuruTelecom()).equals("Access Details to Guru99 Telecom"))
			{
				System.out.println("Customer Id generated successfully");
			}
			else
			{
				System.out.println("Customer Id not generated");
			}
			}
}


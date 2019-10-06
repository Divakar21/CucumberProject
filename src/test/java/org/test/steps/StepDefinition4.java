package org.test.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition4 {
	static WebDriver driver;
	@Given("User is on demoguru telecom page")
	public void user_is_on_demoguru_telecom_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
	}

	@When("User enters the FirstName and LastName")
	public void user_enters_the_FirstName_and_LastName(DataTable dataTable) {
		List<List<String>> custList = dataTable.asLists(String.class);
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys(custList.get(1).get(0));
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys(custList.get(1).get(1));
	}

	@When("User enters the Email Address and the address location")
	public void user_enters_the_Email_Address_and_the_address_location(DataTable dataTable) {
		List<List<String>> custList1 = dataTable.asLists(String.class);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys(custList1.get(1).get(0));
	    WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));
	    address.sendKeys(custList1.get(1).get(1));
	}

	@When("User enters the Mobile No and the user clicks the submit button")
	public void user_enters_the_Mobile_No_and_the_user_clicks_the_submit_button(DataTable dataTable) {
		List<List<String>> custList2 = dataTable.asLists(String.class);
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobileno.sendKeys(custList2.get(1).get(0));
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
	}

	@Then("the customer gets the confirmation message")
	public void the_customer_gets_the_confirmation_message() {
		System.out.println("CustomerID generated successfully");
		driver.quit();
	}

}

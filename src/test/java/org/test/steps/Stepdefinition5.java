package org.test.steps;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Stepdefinition5 {
	static WebDriver driver;
	@Given("The user is on demoguru telecom page")
	public void the_user_is_on_demoguru_telecom_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();

	}

	@When("User enters the FirstName,LastName,Email Address and the address location")
	public void user_enters_the_FirstName_LastName_Email_Address_and_the_address_location(DataTable dataTable) {
		Map<String,String> custList = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		WebElement Firstname = driver.findElement(By.name("fname"));
		Firstname.sendKeys(custList.get("firstName"));
		WebElement Lastname = driver.findElement(By.name("lname"));
		Lastname.sendKeys(custList.get("lastName"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys(custList.get("Email"));
	    WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));
	    address.sendKeys(custList.get("Address"));
	}

	@When("the user enters the Mobile No and the user clicks the submit button")
	public void the_user_enters_the_Mobile_No_and_the_user_clicks_the_submit_button(DataTable dataTable) {
		Map<String,String> custList = dataTable.asMap(String.class, String.class);
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobileno.sendKeys(custList.get("MobileNo"));
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
	}

	@Then("the user can able to see the customer id generated.")
	public void the_user_can_able_to_see_the_customer_id_generated() {
		System.out.println("CustomerID generated successfully");
	    driver.quit();
	}


}

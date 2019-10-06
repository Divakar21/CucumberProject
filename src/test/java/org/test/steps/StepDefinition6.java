package org.test.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition6 {
	static WebDriver driver;
	@Given("User is on guru telecom page")
	public void user_is_on_guru_telecom_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
	}

	@When("User enters the firstName,lastName,email Address,address location and mobileno")
	public void user_enters_the_firstName_lastName_email_Address_address_location_and_mobileno(DataTable dataTable) {
		List<Map<String,String>> custList = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		WebElement Firstname = driver.findElement(By.name("fname"));
		Firstname.sendKeys(custList.get(1).get("firstName"));
		WebElement Lastname = driver.findElement(By.name("lname"));
		Lastname.sendKeys(custList.get(1).get("lastName"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys(custList.get(1).get("Email"));
	    WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));
	    address.sendKeys(custList.get(1).get("Address"));
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobileno.sendKeys(custList.get(1).get("MobileNo"));
		}

	@When("the user clicks the submit option")
	public void the_user_clicks_the_submit_option() {
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();   
	}

	@Then("customer can able to see the generated customer id.")
	public void customer_can_able_to_see_the_generated_customer_id() {
		System.out.println("CustomerID generated successfully");
	    driver.quit();
	}


}

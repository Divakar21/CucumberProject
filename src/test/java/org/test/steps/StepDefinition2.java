package org.test.steps;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition2 {
	static WebDriver driver;
	@Given("User is on demo guru telecom page")
	public void user_is_on_demo_guru_telecom_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
	}

	@When("User enters the FirstName and LastName{string},{string}")
	public void user_enters_the_FirstName_and_LastName(String a, String b) {
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys(a);
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys(b);
	}

	@When("User enters the Email Address and the address location{string},{string}")
	public void user_enters_the_Email_Address_and_the_address_location(String s1, String s2) {
		 	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		    email.sendKeys(s1);
		    WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));
		    address.sendKeys(s2);
	}

	@When("User enters the Mobile No{string}")
	public void user_enters_the_Mobile_No(String s) {
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobileno.sendKeys(s);
	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
	}

	@Then("the customer gets the successful message")
	public void the_customer_gets_the_successful_message() {
		WebElement text = driver.findElement(By.xpath("//h1[text()='Access Details to Guru99 Telecom']"));
		String s = text.getText();
		System.out.println(s);
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the customer id:");
		int n = sn.nextInt();
		if(s.equals("Access Details to Guru99 Telecom")){
			System.out.println("Customer Id is generated successfully");
		}
		else {
			System.out.println("Customer id is not generated successfully");
		}
			driver.quit();
		}
	}

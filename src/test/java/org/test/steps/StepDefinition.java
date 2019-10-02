package org.test.steps;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver;
	@Given("User is in demo guru telecom page")
	public void user_is_in_demo_guru_telecom_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		driver.manage().window().maximize();
	}

	@When("User clicks the add customer tab and enters the FirstName and LastName")
	public void user_enters_the_FirstName_and_LastName() {
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Divakar");
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Muthu"); 
	}

	@When("User enters the Email Id and the address location")
	public void user_enters_the_Email_Id_and_the_address_location() {
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys("divakarganesh21@gmail.com");
	    WebElement Address = driver.findElement(By.xpath("//textarea[@id='message']"));
	    Address.sendKeys("No 10 United Colony Chennai");
	}

	@When("User enters the Mobile Number")
	public void user_enters_the_Mobile_Number() {
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobileno.sendKeys("9791148956");
	}

	@When("User clicks the submit button")
	public void user_clicks_the_submit_button() {
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
	}

	@Then("the customer id is generated succesfully.")
	public void the_customer_id_is_generated_succesfully() {
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


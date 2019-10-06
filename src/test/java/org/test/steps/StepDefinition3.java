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

public class StepDefinition3 {
	static WebDriver driver;
	@Given("User is on amazon page")
	public void user_is_on_amazon_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@When("User clicks the create your account")
	public void user_clicks_the_create_your_account() {
		driver.findElement(By.xpath("//a[text()='Sign in securely']")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	}

	@When("User enters the username, mobile no and the email address")
	public void user_enters_the_username_mobile_no_and_the_email_address(DataTable dataTable) {
		List<String> custList = dataTable.asList(String.class);
		WebElement Name = driver.findElement(By.xpath("//input[@name= 'customerName']"));
		Name.sendKeys(custList.get(0));
		WebElement phoneno = driver.findElement(By.id("ap_phone_number"));
		phoneno.sendKeys(custList.get(1));
		WebElement Email = driver.findElement(By.xpath("//input[@id = 'ap_email']"));
		Email.sendKeys(custList.get(2));
	}

	@When("User enters the Password and re-enters the Password")
	public void user_enters_the_Password_and_re_enters_the_Password(DataTable dataTable) {
		List<String> custList1 = dataTable.asList(String.class);
		WebElement Pwd = driver.findElement(By.xpath("//input[@name='password']"));
		Pwd.sendKeys(custList1.get(0));
		//WebElement PwdCheck = driver.findElement(By.xpath("//input[@name= 'passwordCheck']"));
		//PwdCheck.sendKeys(custList.get(4));
	}

	@When("the user clicks the create your amazon account.")
	public void the_user_clicks_the_create_your_amazon_account() throws InterruptedException {
		WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
		Submit.click();
		Thread.sleep(40000);
	}

	@Then("the customer navigates to home page.")
	public void the_customer_navigates_to_home_page() {
		String url = driver.getCurrentUrl();
		boolean b = url.contains("EmailAddress");
		System.out.println(b);
		if(url.equals(b)) {
			System.out.println("Customer logged into the account");
		}
		else {
			System.out.println("Customer not able to login the account");
		}
		driver.quit();

	}
}

package org.test.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.test.steps.Hooks;

public class Base {
	public static WebDriver driver;
	public static WebDriver getBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\CucumberFramework\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
	}
	
	public static void loadUrl(String Url) {
		Hooks.driver.get(Url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static WebElement findElementById(String Value) {
		WebElement txt = driver.findElement(By.id(Value));
		return txt;
	}
	
	public static void setText(WebElement element, String value) {
		   element.sendKeys(value);	 
	}
	
	public static void setKeys(WebElement element, Keys value) {
		   element.sendKeys(value);	 
	}
	
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public static String getText(WebElement element) {
		String value = element.getText();
		System.out.println(value);
		return value;
	}
	private static boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static String getAttribute(WebElement element) {
		String value = null;
		if(elementFound(element)) {
		value = element.getAttribute("value");
		System.out.println(value);
	}
		return value;
	}
	public static void selectByValue (WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static WebElement findElementByPath(String path) {
		WebElement x = driver.findElement(By.xpath(path));
		return x;
	}
	public static void btnClick(WebElement element) {
			element.click();
	}
	public static void quitBrowser() {
			driver.quit();
	}

}

package com.facebookStepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends BaseClass {
	@When("I should perform login {string}, {string}")
	public void i_should_perform_login(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}
	

//	WebDriver driver;

//@Given("I am on the facebook page")
//public void i_am_on_the_facebook_page() {
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//
//}
//
//@When("I should perform login")
//public void i_should_perform_login(io.cucumber.datatable.DataTable dataTable) {
//	List<List<String>> emp = dataTable.asLists();
//	List<String> e = emp.get(1);
//	String name = e.get(0);
//	String pass = e.get(1);
//	WebElement txtUserName = driver.findElement(By.id("email"));
//	txtUserName.sendKeys(name);
//	WebElement txtPassword = driver.findElement(By.id("pass"));
//	txtPassword.sendKeys(pass);
//	
//	
//}


}

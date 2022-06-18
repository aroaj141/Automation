package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.reports.Report1;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
	@CucumberOptions(monochrome=false,features="src\\test\\resources", glue="com.stepdefinition",tags= "@chennai")

	public class TestRunnerClass {

	@AfterClass
	public static void afterclass() {
Report1.generateJVMReport("C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\target\\cucumber.json");
	}
}

//
//WebDriver driver;

//@Given("I am on adactinHOtel Login page")
//public void a() {
//	WebDriverManager.chromedriver().setup();
//	driver= new ChromeDriver();
//	driver.get("https://adactinhotelapp.com/index.php");
//	
//}

//When I should enter "<username>","<password>"
//And I should click login button
//Then I should verify success login message 
//Examples:
//|username|password|
//|aroakash001|123456789|
////
//@When("I should enter {String},{String}")
//public void b(String s1, String s2) {
//	WebElement txtUserName = driver.findElement(By.id("username"));
//	txtUserName.sendKeys(s1);
//	WebElement txtPassword = driver.findElement(By.id("password"));
//	txtPassword.sendKeys(s2);
//}
//
//@When("I should click login button")
//public void c() {
//	WebElement btnLogin = driver.findElement(By.name("login"));
//	btnLogin.click();
//	}
//
//@Then("I should verify success login message")
//public void i_should_verify_success_login_message() {
//
////Assert.assertTrue("verify login", true);
//
//}
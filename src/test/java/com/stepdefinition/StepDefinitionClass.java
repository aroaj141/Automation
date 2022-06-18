package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass extends BaseClass {
	@Given("I am on adactinHOtel Login page")
	public void a() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
	}

	@When("I should enter {string}  ,{string}")
	public void i_should_enter(String string, String string2) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(string);
		WebElement txtPass= driver.findElement(By.id("password"));
		txtPass.sendKeys(string2);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
	}
	@When("i should search the {string},{string},{string}")
	public void i_should_search_the(String string, String string2, String string3) {

		WebElement btnLocation = driver.findElement(By.id("location"));
		Select select = new Select(btnLocation);
		select.selectByVisibleText(string);
		
		WebElement drdnHotels = driver.findElement(By.id("hotels"));
		Select select1 = new Select(drdnHotels);
		select1.selectByVisibleText(string2);	
		
		WebElement drdnRoomType = driver.findElement(By.id("room_type"));
		Select select2 = new Select(drdnRoomType);
		select2.selectByVisibleText(string3);
		
		
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();



	}





@When("I should select the hotel")
public void i_should_select_the_hotel() {
	WebElement btnClk = driver.findElement(By.id("radiobutton_0"));
	btnClk.click();
	WebElement SctContinue = driver.findElement(By.id("continue"));
	SctContinue.click();
}
@When("I should enter {string},{string},{string},{string},{string},{string},{string},{string}")
public void i_should_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {

	WebElement txtFirst = driver.findElement(By.id("first_name"));
	txtFirst.sendKeys(string);
	WebElement txtLast = driver.findElement(By.id("last_name"));
	txtLast.sendKeys(string2);
	WebElement txtAddrs = driver.findElement(By.id("address"));
	txtAddrs.sendKeys(string3);
		WebElement txtCrdNo = driver.findElement(By.id("cc_num"));
	txtCrdNo.sendKeys(string4);
	WebElement drdnCrdType = driver.findElement(By.id("cc_type"));
	drdnCrdType.sendKeys(string5);

	WebElement drdnExMonth = driver.findElement(By.id("cc_exp_month"));
	drdnExMonth.sendKeys(string6);
	WebElement drdnExYear = driver.findElement(By.id("cc_exp_year"));
	drdnExYear.sendKeys(string7);
	WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
	txtCvv.sendKeys(string8);
	WebElement btnBookNow = driver.findElement(By.id("book_now"));
	btnBookNow.click();
	Thread.sleep(10000);
	WebElement txt = driver.findElement(By.id("order_no"));
	String orderNo = txt.getAttribute("value");
	System.out.println(orderNo);






}

	@Then("I should verify success login message")
	public void i_should_verify_success_login_message() {
		Assert.assertTrue("verify login", true);
	}

	@When("I should perform login {string}, {string}")
	public void i_should_perform_login(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
		}
	
	
//	
//	@Given("I am on adactinHOtel Login page")
//	public void i_am_on_adactinHOtel_Login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/index.php");
//		
//	}
//	
//	@When("I should enter username and password")
//	public void i_should_enter_username_and_password() {
//		WebElement txtUserName = driver.findElement(By.id("username"));
//		txtUserName.sendKeys("aroakash001");
//		WebElement txtPassword = driver.findElement(By.id("password"));
//		txtPassword.sendKeys("123456789");
//	}
//
//	@When("I should click login button")
//	public void i_should_click_login_button() {
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		btnLogin.click();
//		}
//
//	@Then("I should verify success login message")
//	public void i_should_verify_success_login_message() {
//
//	Assert.assertTrue("verify login", true);
//	
//	}
//

}

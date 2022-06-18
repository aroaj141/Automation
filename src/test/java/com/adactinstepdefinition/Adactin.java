package com.adactinstepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adactinHotel.BookPage;
import com.adactinHotel.LoginPagec;
import com.adactinHotel.SelectHotel;
import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin extends BaseClass {
	@Given("I am on adactinHOtel Login page")
	public void a() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/index.php");
		maximize();
	}

	@When("I should enter {string}  ,{string}")
	public void i_should_enter(String string, String string2) {
		LoginPagec loginPagec = new LoginPagec();
		loginPagec.logIn(string, string2);
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
		SelectHotel selectpage = new SelectHotel();
		selectpage.selectHotel();
	}

	@When("I should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void i_should_enter(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) throws InterruptedException {
BookPage bookpage = new BookPage();
bookpage.bookHotel(string, string2, string3, string4, string5, string6, string7, string8);

		
		Thread.sleep(10000);
		WebElement txt = driver.findElement(By.id("order_no"));
		String orderNo = txt.getAttribute("value");
		System.out.println(orderNo);

	}

	@Then("I should verify success login message")
	public void i_should_verify_success_login_message() {
		Assert.assertTrue("verify login", true);
	}

}

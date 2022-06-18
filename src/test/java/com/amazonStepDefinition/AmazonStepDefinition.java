package com.amazonStepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepDefinition {
	WebDriver driver;

	@Given("I am on the amazon page")
	public void i_am_on_the_amazon_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}

	@When("I should enter the product")
	public void i_should_enter_the_product(io.cucumber.datatable.DataTable dataTable) {
//		List<String> emp = dataTable.asList();
//		
//		String data = emp.get(2);
//		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
//		txtSearch.sendKeys(data,Keys.ENTER);
		
		
		
//		
//		Map<String, String> asMap = dataTable.asMap(String.class,String.class);
//		String data = asMap.get("ios");
//		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
//		txtSearch.sendKeys(data,Keys.ENTER);
		
		
		
		
		}

	
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
driver.quit();
	}


}

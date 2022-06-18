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
	@CucumberOptions(features="src\\test\\resources\\Feature\\facebook.feature",glue="com.facebookStepDefinition")

	public class TestRunnerClass3 {

//	@AfterClass
//	public static void afterclass() {
//Report1.generateJVMReport("C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\target\\cucumber.json");
//	}
}


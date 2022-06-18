package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html ");
	WebElement txtFirstNaml=  driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	txtFirstNaml.sendKeys("Aro");
	WebElement txtLstNme=  driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	txtLstNme.sendKeys("Akash");
	WebElement txtAddress=  driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	txtAddress.sendKeys("thoraipakam gd nagar");
	WebElement txtEmail=  driver.findElement(By.xpath("//input[@type='email']"));
	txtEmail.sendKeys("Aro1314@gmail.com");
	WebElement txtPhone=  driver.findElement(By.xpath("//input[@type='tel']"));
	txtPhone.sendKeys("6381389380");
	}

}

package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.facebook.com/");
		WebElement txtusernme=  driver.findElement(By.xpath("//input[@id='email']"));
	txtusernme.sendKeys("aro aj");
	WebElement txtPass= driver.findElement(By.xpath("//input[@id='pass']"));
	txtPass.sendKeys("2354354");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnLogin.click();
	}
}

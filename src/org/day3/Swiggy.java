package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.swiggy.com/");
	
		WebElement btnSign = driver.findElement(By.xpath("//a[text()='Sign up']"));
		btnSign.click();
		WebElement txtnum=  driver.findElement(By.id("mobile"));
		txtnum.sendKeys("3698546320");
		WebElement txtname=  driver.findElement(By.id("name"));
		txtname.sendKeys("kumare");
		WebElement txtmail=  driver.findElement(By.id("email"));
		txtmail.sendKeys("chennai13@gmial.com");
		WebElement txtPass=  driver.findElement(By.id("password"));
		txtPass.sendKeys("chennaigwiugtw");
	
	}
	

}

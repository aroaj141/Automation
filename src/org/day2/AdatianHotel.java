package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdatianHotel {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get(" http://adactinhotelapp.com/");
		WebElement txtusernme=  driver.findElement(By.id("username"));
		txtusernme.sendKeys("aro aj");
		WebElement txtPass= driver.findElement(By.id("password"));
		txtPass.sendKeys("sfshf");	

		}
		
		
		
		
	

}

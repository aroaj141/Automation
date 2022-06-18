package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinPrint {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get(" http://adactinhotelapp.com/");
			WebElement textUser = driver.findElement(By.id("username"));
		textUser.sendKeys("green");
		String attribute = textUser.getAttribute("value");
		System.out.println(attribute);
		WebElement texPass = driver.findElement(By.id("password"));
		texPass.sendKeys("65651541");
		String attribute1 = texPass.getAttribute("value");
		System.out.println(attribute1);
	}

}

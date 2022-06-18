package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
	WebElement txtusernme=  driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtusernme.sendKeys("aro aj");
	WebElement txtPass= driver.findElement(By.xpath("//input[@type='password']"));
	txtPass.sendKeys("sfshf");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	btnLogin.click();
	}

}

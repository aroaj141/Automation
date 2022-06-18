package org.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
	WebElement txtusernme=  driver.findElement(By.name("username"));
	txtusernme.sendKeys("aro_aj");
	WebElement txtPass= driver.findElement(By.name("password"));
	txtPass.sendKeys("aroakash141");
	Thread.sleep(1000);
	WebElement btn= driver.findElement(By.xpath("//button[@type='submit']"));
	btn.click();
	
	Thread.sleep(5000);
	WebElement btn3 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	btn3.click();
	Thread.sleep(6000);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	Thread.sleep(3000);
		
		alert.dismiss();
		
		
		

	}

}

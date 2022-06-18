package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagte {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement btn2 = driver.findElement(By.xpath("//button[@type='submit']"));
		btn2.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		

	}


}

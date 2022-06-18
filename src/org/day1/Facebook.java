package org.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		WebElement txt = driver.findElement(By.cssSelector("#email"));
		txt.sendKeys("gu");
		WebElement txtPass = driver.findElement(By.cssSelector("input#pass"));
		txtPass.sendKeys("augd");
//		WebElement text1 = driver.findElement(By.id("email"));
//		text1.sendKeys("smfkesng");
//		
//		WebElement Text2 = driver.findElement(By.id("pass"));
//		Text2.sendKeys("pass");
//		String title = driver.getTitle();
//		
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
	}

}

package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrpit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.facebook.com/");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement txt = driver.findElement(By.id("email"));
		executor.executeScript("arguments[0].setAttribute('value','ram')",txt);
   Object text = executor.executeScript("return arguments[0].getAttribute('value')", txt);
	System.out.println(text);
	WebElement txt1 = driver.findElement(By.id("pass"));
	
	executor.executeScript("arguments[0].setAttribute('value','udguofiea')", txt1);
	Object text1 = executor.executeScript("return arguments[0].getAttribute('value')",txt1);
	System.out.println(text1);
	
	}
}

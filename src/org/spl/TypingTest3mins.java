package org.spl;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypingTest3mins {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.typingtest.com/");
//Alert alert = driver.switchTo().alert();
//alert.accept();
Thread.sleep(2000);
WebElement findElement = driver.findElement(By.xpath("//button[@mode='primary']"));
findElement.click();
Thread.sleep(2000);
WebElement btnclick = driver.findElement(By.id("minutes_t"));
btnclick.click();
Thread.sleep(2000);
WebElement btn = driver.findElement(By.xpath("//a[contains(text(),'3 Minutes Test')]"));
btn.click();
WebElement findElement2 = driver.findElement(By.xpath("//button[@class='start-btn over-anim']"));
findElement2.click();
	}

}

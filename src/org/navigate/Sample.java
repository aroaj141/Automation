package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https:www.facebook.com/");
	WebElement txtusernme=  driver.findElement(By.id("email"));
	txtusernme.sendKeys("aro aj");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000); driver.navigate().back();
	Thread.sleep(2000); driver.navigate().forward();
	WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'in')]"));
String text = ele.getText();
System.out.println(text);
WebElement txtusernme2=  driver.findElement(By.id("email"));
txtusernme2.sendKeys("aro aj");
String attribute = txtusernme2.getAttribute("value");
System.out.println(attribute); 
}
}

package org.javascript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scolling {

	public static void main(String[] args)  throws Throwable{
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:www.amazon.com");
	//Alert alert = driver.switchTo().alert();
	//alert.dismiss();
	
	JavascriptExecutor executor  = (JavascriptExecutor) driver;
	WebElement scrlDown = driver.findElement(By.xpath("(//a[@class='nav_a'])[6]"));
	executor.executeScript("arguments[0].scrollIntoView(true)",scrlDown);
	Thread.sleep(3000);
	WebElement up = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	executor.executeScript("arguments[0].scrollIntoView(false)", up);
	
	
	}

}

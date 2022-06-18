package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement scrlDown = driver.findElement(By.xpath("//a[text()='Australia']"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", scrlDown);
		Thread.sleep(3000);
		WebElement scrlUp = driver.findElement(By.xpath("(//span[text()='All'])[2]"));

		jse.executeScript("arguments[0].scrollIntoView(false)", scrlUp);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		WebElement txt = driver.findElement(By.id("email"));
//		executor.executeScript("arguments[0].setAttribute('value','dbekhbvk')", txt);
//		Object print = executor.executeScript("return arguments[0].getAttribute('value')",txt   );
//System.out.println(print);
//WebElement btn = driver.findElement(By.name("login"));
//executor.executeScript("arguments[0].click()",btn);
	}
	
}
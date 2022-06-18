package org.spltaks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		 Actions action = new Actions(driver);
WebElement findElement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement findElement2 = driver.findElement(By.id("bank"));
       
        action.dragAndDrop(findElement, findElement2).perform();
        WebElement w = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        WebElement q = driver.findElement(By.id("loan"));
        action.dragAndDrop(w, q).perform();
        WebElement a = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
	WebElement s = driver.findElement(By.id("amt7"));
	
	action.dragAndDrop(a, s).perform();
	 WebElement a1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement s3= driver.findElement(By.id("amt8"));
		
		action.dragAndDrop(a1, s3).perform();
	}
	}

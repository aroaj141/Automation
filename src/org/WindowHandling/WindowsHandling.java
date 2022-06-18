package org.WindowHandling;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone",Keys.ENTER);
		WebElement linkClick = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (128GB) - Midnight']"));
		linkClick.click();
		// to find parent window id
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
//		
		//to find child window id
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		//allwindow id from set of list
  List<String> li =new ArrayList();
  li.addAll(allWindow);
  driver.switchTo().window(li.get(1));
  
		WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-button"));
		btnAddToCart.click();
		
		
		driver.switchTo().window(parentWindow);
		
		WebElement txtsearch1 = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch1.clear();
		txtsearch1.sendKeys("oneplus",Keys.ENTER);
		
//		WebElement btn = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Mini (128GB) - Midnight']"));
//		btn.click();
		
		
		
		
	}

}

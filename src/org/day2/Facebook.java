package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.facebook.com/");
	WebElement txtusernme=  driver.findElement(By.id("email"));
	txtusernme.sendKeys("aro aj");
	String text = txtusernme.getAttribute("value");
	System.out.println(text);
	WebElement txtPASS= driver.findElement(By.id("pass"));
	txtPASS.sendKeys("sfshf");
	String txt = txtPASS.getAttribute("value");
	System.out.println(txt);
	
		
		
		
		
		

	}

}

package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenstechnologyAddressAdayar {


	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
  driver.get(" http://greenstech.in/selenium-course-content.html");
WebElement txtPara = driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
	String text = txtPara.getText();
	
	System.out.println(text);
	
	
	
	
	}

}

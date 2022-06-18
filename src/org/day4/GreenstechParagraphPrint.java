package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenstechParagraphPrint {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(" http://www.greenstechnologys.com");
	WebElement txtPara = driver.findElement(By.xpath("//p[contains(text(),'leading')]"));
	String text = txtPara.getText();
	
	System.out.println(text);
	
	
	
	
	}
}

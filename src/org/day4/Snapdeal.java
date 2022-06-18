package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/ \r\n" + 
				"");
	WebElement txtSearch=  driver.findElement(By.name("keyword"));
	txtSearch.sendKeys("Ambrane PP-30 Pro 27000 -mAh Li-Polymer Power Bank Black");
	WebElement btnSearch=  driver.findElement(By.className("searchTextSpan"));
	btnSearch.click();
	//to click a product
	WebElement btnClick=  driver.findElement(By.xpath("(//div[@class='product-desc-rating'])[1]"));
	btnClick.click();
	}
}

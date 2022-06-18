package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement txtSearch=  driver.findElement(By.xpath("//input[@maxlength='10']"));
	txtSearch.sendKeys("6381689456");
	WebElement btnLogin = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
	btnLogin.click();

	}

}

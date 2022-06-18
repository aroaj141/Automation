package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGreensVelmurugan {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.google.com/");
		WebElement text = driver.findElement(By.name("q"));
	text.sendKeys("greens velmurugan");
	Thread.sleep(1000);
	WebElement btnClick = driver.findElement(By.xpath("//span[text()='greens velmurugan']"));
	btnClick.click();
	
	
	}

}

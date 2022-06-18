package org.day3;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripTrain {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.cleartrip.com/trains\r\n" + 
				"");
		  WebElement txtSrc = driver.findElement(By.id("from_station"));

		txtSrc.sendKeys("Chennai Beach (MSB)");

		
		Thread.sleep(2000);
		WebElement txtDest = driver.findElement(By.id("to_station"));
		txtDest.sendKeys("Mumbai Central (BCT)");
		Thread.sleep(3000);
		
		WebElement btnClick = driver.findElement(By.id("trainFormButton"));
		btnClick.click();
}
} 

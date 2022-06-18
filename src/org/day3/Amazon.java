package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		WebElement txtSearch=  driver.findElement(By.id("twotabsearchtextbox"));
	txtSearch.sendKeys("iphone");
	Thread.sleep(2000);
	WebElement btnSearch=  driver.findElement(By.id("nav-search-submit-button"));
	btnSearch.click();
	//to click a product
	//WebElement btnSearch=  driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none _deals-shoveler-v2_style_imageContainer__2Wm4A'])[2]"));
	//btnSearch.click();
	}
}

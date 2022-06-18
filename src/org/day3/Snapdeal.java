package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/ ");
		WebElement txtSign=  driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		Actions actions = new Actions(driver); 
		actions.moveToElement(txtSign).perform();
		WebElement btnLogin = driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		 btnLogin.click();
		 Thread.sleep(3000);
		WebElement txtEmail =  driver.findElement(By.xpath("//input[@id='userName']"));
			txtEmail.sendKeys("Aro1341@gmail.com");
			//WebElement btnContinue = driver.findElement(By.id("checkUser"));
			 //btnContinue.click();
		 
		 
	}

}

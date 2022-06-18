package org.spl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https:www.youtube.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement txtusernme=  driver.findElement(By.xpath("//input[@id='search']"));
		txtusernme.sendKeys("malang malang title track");
		WebElement btnC = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		
		btnC.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement btnCl = driver.findElement(By.xpath("//a[@title='Full Video: Malang (Title Track)| Aditya Roy Kapur, Disha Patani, Anil K, Kunal K | Ved S | Mohit S']"));
		btnCl.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement btnC1 = driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
		
		btnC1.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement btnC2 = driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']"));
		
		btnC2.click();
		
		
		
		
	}

}

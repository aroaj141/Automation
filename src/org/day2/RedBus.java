package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.redbus.in/");
WebElement btnlick = driver.findElement(By.id("i-icon-profile"));

btnlick.click();
//  WebElement txtSrc = driver.findElement(By.id("src"));
  
//
//txtSrc.sendKeys("Tambaram, Chennai");
////String text = txtSrc.getText();
////System.out.println("text");
//WebElement txtDest = driver.findElement(By.id("dest"));
//txtDest.sendKeys("Borivali East, Mumbai");
////String attribute = txtDest.getAttribute("value");
// //System.out.println("attribute");



	}

}

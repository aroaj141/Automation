package org.webtables;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.w3schools.com/html/html_tables.asp");
		
		WebElement tableDatas = driver.findElement(By.id("customers"));
		
		List<WebElement> allRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			 WebElement element = allRows.get(i);
			 String text = element.getText();
			 if (text.equals("German")) {
				
			}
			 
			 
//			 System.out.println(text);
			
		}
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	 WebElement txt = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
//
//		List<WebElement> allRow = txt.findElements(By.tagName("td"));
//		for (int i = 0; i < allRow.size(); i++) {
//			WebElement ele = allRow.get(i);
//			String text = ele.getText();
//			if (text.equals("Austria")) {
//				
//			}
//			//System.out.println(text);
//			Alert alert = driver.switchTo().alert();
//			alert.
//		}
		
	}



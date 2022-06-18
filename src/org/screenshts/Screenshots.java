package org.screenshts;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Screenshots {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https:www.facebook.com/");
			TakesScreenshot sr = (TakesScreenshot) driver;
			File as = sr.getScreenshotAs(OutputType.FILE);
			
			System.out.println(as);
			
			
		//	TakesScreenshot Asr = (TakesScreenshot) driver;
			//File screenshotAs = Asr.getScreenshotAs(OutputType.FILE);
			//System.out.println(screenshotAs);
			//File dest = new File();
			
			
			
		}

}

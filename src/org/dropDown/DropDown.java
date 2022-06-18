package org.dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		
		WebElement btnGender = driver.findElement(By.xpath("//input[@value='FeMale']"));
		btnGender.click();
		Thread.sleep(2000);
		WebElement btnHobbies = driver.findElement(By.id("checkbox2"));
		 btnHobbies.click();
		 Thread.sleep(2000);
		 WebElement btnHobbies1 = driver.findElement(By.id("checkbox1"));
		 btnHobbies1.click();
		 Thread.sleep(2000);
		 WebElement btnHobbies2 = driver.findElement(By.id("checkbox3"));
		 btnHobbies2.click();
		 Thread.sleep(2000);
		 WebElement btnLanguage = driver.findElement(By.xpath("//div[@id='msdd']"));
			btnLanguage.click();
			WebElement btnClick = driver.findElement(By.xpath("//a[text()='Croatian']"));
			btnClick.click();
			 Thread.sleep(4000);
			 WebElement drdnCountry = driver.findElement(By.id("countries"));
			 Select select = new Select(drdnCountry );
			 select.selectByIndex(2);
		
	
		 WebElement txtPass = driver.findElement(By.id("firstpassword"));
		 txtPass.sendKeys("aroaj");
		 Thread.sleep(2000);
		 WebElement txtPass2 = driver.findElement(By.id("secondpassword"));
		 txtPass2.sendKeys("aroaj");
		
		//List<WebElement> drdn = select.getOptions();
	//to get sizw
		//int size = drdn.size();
		//System.out.println(size);
	//to get single index value	
		//WebElement element = drdn.get(10);
		//String text = element.getText();
		//System.out.println(text);
	// to print all the options
	//    	for (int i = 0; i < drdn.size(); i++) {
	//     WebElement element = drdn.get(i);
	//		String text = element.getText();
	//		System.out.println(text);
			
		}
	}



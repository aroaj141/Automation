package day.actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.facebook.com/");
		driver.manage().window().maximize();
		WebElement move = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(move,"wdvrb").keyUp(Keys.SHIFT).perform();
		
		
		
		
		
		//move.sendKeys("bedfivw");

actions.doubleClick(move).perform();




Thread.sleep(2000);
//actions.getActiveKeyboard();
//actions.click(move).perform();


// Robot robot = new Robot();
// robot.keyPress(KeyEvent.VK_ENTER);
// robot.keyRelease(KeyEvent.VK_ENTER);

	}

}

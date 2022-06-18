package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver driver;

	public static  void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public  WebElement locatorId(String text) {
		WebElement element = driver.findElement(By.id(text));
		return element;
	}

	public WebElement locatorName(String text) {
		WebElement element = driver.findElement(By.name(text));
		return element;
	}

	public WebElement locatorClass(String text) {
		WebElement element = driver.findElement(By.className(text));
		return element;
	}

	

	public static  void loadUrl(String url) {
		driver.get(url);
	}

	public  void SendKey(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void closeAllWindows() {
		driver.quit();
	}
	public void clear(WebElement element) {
		
		clear(element);

		
	}

	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement findElementByxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String title() {
		String title = driver.getTitle();
		return title;
	}

	public String getEnteredUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public void drdnSelectOptionByText(WebElement element, String  text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void drdnSelectOptionByValue(WebElement element, String text) {
		Select select = new Select(element);

		select.selectByValue(text);
	}

	public void drdnSelectOptionByIndex(WebElement element, int ccExp) {
		Select select = new Select(element);
		select.selectByIndex(ccExp);
	}

	public void drdnDeselectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void drdnDeselectOptionByValue(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByValue(text);
	}

	public void drdnDeselectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void drdnDeselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public List<WebElement> getAllselectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public WebElement getFirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void typejs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
	}

	public Object typejsGet(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("return arguments[0].getAttribute('value')", element);
		return executeScript;
	}

	public void jsScrollDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void jsScrollUp(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	public Alert alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}

	public Alert alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		return alert;
	}
	public void sleep(int sec) throws InterruptedException {
Thread.sleep(sec);
	}

	public Alert alertSendKeys(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
		return alert;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
	}

	public String getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	public void frameIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void frameId(String Id) {
		driver.switchTo().frame(Id);
	}

	public void frameDefault() {
		driver.switchTo().defaultContent();
	}

	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement element1, WebElement element2) {
		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2).perform();
	}

	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public String getData(String sheetName, int rownum, int cellnum) throws IOException {
		String res = null;
		File file = new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Frame\\\\ExcelFolder\\\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormated = new SimpleDateFormat("dd-MM-yyyy");
				res = dateFormated.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				res = valueOf.toString();
			}

			break;

		default:
			break;
		}
		return res;

	}

	public void updateData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Frame\\ExcelFolder\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
			
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	public void writeDate(String sheetName, int rowNum, int cellNum, String data) throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Frame\\ExcelFolder\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row createrow = sheet.getRow(rowNum);
		Cell createCell = createrow.createCell(cellNum);
		createCell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out); 

	}

}

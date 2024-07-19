package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	//1.
	public static void launchChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	//2.
	public static void winMax() {
			driver.manage().window().maximize();
	}
	
	//3
	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	//4
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	//5
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());

	}
	
	//6
	public static void fill(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	
	//7
	public static void btnClick(WebElement ele) {
		
		ele.click();
	}
	
	//8
	public static void closeChrome() {
		driver.close();

	}
	
	//9
	public static String getData(int rowNumber,int cellNumber) throws IOException {
		
		//1. Mention ur location of ur excel file
		File f = new File("C:\\Kannan\\EclipseProjects\\FrameworkBatch8thMay\\target\\TestData\\2ndMayBatch.xlsx");
		
		//2. Read the file
		FileInputStream fin = new FileInputStream(f);
		
		//3. Type of Workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//4. Get the sheet
		Sheet s = w.getSheet("greens");
		
		Row row = s.getRow(rowNumber);
		
		Cell c = row.getCell(cellNumber);
		
		int cellType = c.getCellType();
		
		String value;
		
		if (cellType==1) {
			
			value = c.getStringCellValue();		
		}
		else if (DateUtil.isCellDateFormatted(c)) {	
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yyyy");
			value = sim.format(d);	
		}
		else {
			double d = c.getNumericCellValue(); //7.666099973 ---->Long -----> String  "7666099973";
			//newDataType refName = (newDataType)storedValue;
			long l = (long)d;	
			value = String.valueOf(l);			
		}
		
		return value;	

	}
	
	
	public static void screenshot(String name) throws IOException {
		
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Kannan\\EclipseProjects\\Facebook4thJulyIPT\\target\\Screenshot\\"+name+".jpg");
		FileUtils.copyFile(src, des);

	}
	
	
	public static void quitChrome() {
		
		driver.quit();
		System.out.println("Kannan Pushed");
		System.out.println("Enjoy the weekend - Kannan");
	}
	
	
	
	
	
	
	
	
	
	

}

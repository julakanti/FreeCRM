package com.crm.qa.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
public WebDriver driver;
public Properties prop;
public WebDriver initializer() throws IOException {
	 prop=new Properties() ;
	FileInputStream fis=new FileInputStream("C:\\Users\\PC\\mvn-FreeCRM\\src\\main\\java\\com\\crm\\qa\\resources\\Data.properties");
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	if (browsername.equals("FF")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PC\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if (browsername.equals("chrome")) {
		driver=new ChromeDriver();	
	}
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
}
	public void getScreenshot(String result)throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("‪C:\\Users\\PC\\Desktop\\"+result+"SRI OD.png"));
		
	}
	
}


package com.testngexamples;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TakeScreenshotTest {
	
	
	WebDriver driver ;
	@Test
	public void navigateTest() throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(1000);
	driver.navigate().to("https://www.google.com");
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();//
	Thread.sleep(2000);
	
	File file =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File("D:/Seleniumworkspace/TestNGPractise/src/screenshots/error.png"));
	
	//driver.navigate().refresh();
	
		}
	
	
	

}

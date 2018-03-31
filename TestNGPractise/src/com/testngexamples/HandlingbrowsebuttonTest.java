package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingbrowsebuttonTest {
	
	
	WebDriver driver ;
	@Test
	public void handlingBrowsefile(){
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://html.com/input-type-file/");
	
	driver.findElement(By.name("fileupload")).sendKeys("D:\\Documents\\Resume\\Resume -Manish kumar.docx");
	//String str = driver.switchTo().alert().getText();
	//System.out.println(str);
	//driver.switchTo().alert().accept();
	
	}
	

}

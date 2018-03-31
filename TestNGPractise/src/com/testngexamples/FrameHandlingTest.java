package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingTest {


	WebDriver driver ;
	@Test
	public void frameHandlingTest() throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://www.freecrm.com");
	
	driver.findElement(By.name("username")).sendKeys("roseandsaru");
	driver.findElement(By.name("password")).sendKeys("mk2410");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	
	driver.switchTo().frame("mainpanel");
	
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	//String str = driver.switchTo().alert().getText();
	//System.out.println(str);
	//driver.switchTo().alert().accept();
	
	}
	
}

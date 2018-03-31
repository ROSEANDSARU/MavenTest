package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUpTest {
	
	
	WebDriver driver ;
	
	@Test
	public void alertTest(){
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.xpath(".//*[@class='content selected tasks']")).click();
	
	
	driver.findElement(By.xpath(".//*[@class='deleteButton']/span")).click();
	
		
		
	}

}

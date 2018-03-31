package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAssertionExample {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test(priority=1)
	public void googleTest(){
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Google1");
		
	}
	
	@Test
	public void googleLogo(){
		
		driver.get("https://www.google.co.in");
		boolean b =driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
}

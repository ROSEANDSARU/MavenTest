package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","emailId"})
	public void yahooLoginTest(String browser,String url, String emailId) throws InterruptedException	{
	if(browser.equals("chrome")){	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();	
	}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	
}

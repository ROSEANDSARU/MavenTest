package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Functions;

public class FluentWaitExample {

	WebDriver driver;
	@Test
	public void fluentWaitTest(){
			
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	 driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	 
	Wait<WebDriver>wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	
	 WebElement ele = wait.until(new Function<WebDriver, WebElement>() {

	     public WebElement apply(WebDriver driver) {

	       return driver.findElement(By.xpath("//p[@id='demo']"));

	     }

	   });
	
	}
	
}

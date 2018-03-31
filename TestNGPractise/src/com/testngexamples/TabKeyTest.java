package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TabKeyTest {
	
	WebDriver driver;
	@Test
	public void tabKeyTest() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Actions act = new Actions(driver);
		WebElement login=driver.findElement(By.id("username"));
		login.sendKeys("admin");
		act.sendKeys(login,Keys.TAB).perform();
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		act.sendKeys(pwd,Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"+");
		
		
		
		
		
	}

}

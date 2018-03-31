package com.testngexamples;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseOperationTest {
WebDriver driver;

@Test
public void mouseOperationTest() throws Exception{
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	WebElement wl = driver.findElement(By.xpath(".//span[text()='Electronics']"));
	act.moveToElement(wl).perform();
	//Thread.sleep(2000);
	WebDriverWait wait =new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//span[text()='Apple']")))).click();
	//driver.findElement(By.xpath(".//span[text()='Apple']")).click();
	WebElement wlmac= driver.findElement(By.xpath(".//p[@class='yHn1qE' and text()='Mac']"));
	act.contextClick(wlmac).perform();
	Thread.sleep(2000);
	act.sendKeys("w").perform();
	
	
}
	
}

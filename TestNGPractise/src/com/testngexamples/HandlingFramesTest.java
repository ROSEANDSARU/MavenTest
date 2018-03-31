package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingFramesTest {
	
	WebDriver driver;
	@Test
	public void handlingFramesTest(){
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@href='https://jqueryui.com/datepicker/']")).click();
		//driver.findElement(By.xpath(".//a[text()='Datepicker']")).click();
		WebElement iframe=driver.findElement(By.xpath(".//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();		
		String str="";//driver.findElement(By.xpath(".//div[@class='ui-datepicker-title']")).getText();
		System.out.println(str);
		do
		{
			
			driver.findElement(By.xpath(".//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			str=driver.findElement(By.xpath(".//div[@class='ui-datepicker-title']")).getText();
		}while(str!="June 2018");
		System.out.println(str);	
		driver.findElement(By.xpath(".//a[text()='3']")).click();
		String date=driver.findElement(By.xpath(".//*[@id='datepicker']")).getText();
		
		//Assert.assertEquals("06/03/2018", driver.findElement(By.xpath(".//*[@id='datepicker']")).getText());
		System.out.println(date);
	}

}

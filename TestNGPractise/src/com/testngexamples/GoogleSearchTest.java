package com.testngexamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	WebDriver driver;
	
	@Test
	public void googleSearchTest(){
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		List <WebElement> wl =driver.findElements(By.xpath(".//*[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println(wl.size());
		
		for(int i=0;i<wl.size();i++)
		{
			System.out.println(wl.get(i).getText());
			
		}

	}
	
	
}

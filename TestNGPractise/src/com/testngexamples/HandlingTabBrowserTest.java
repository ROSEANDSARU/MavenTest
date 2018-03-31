package com.testngexamples;

import java.util.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTabBrowserTest {
	WebDriver driver;
	@Test
	public void handlingTabBrowserTest(){
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//a[text()='Flights']")).click();
		String str = driver.getTitle();
		System.out.println(str);
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		Iterator<String>itr = allwindows.iterator();
		String parent = itr.next();
		String child =itr.next();
		driver.switchTo().window(child);
		
		String title=driver.getTitle();
		System.out.println(title);
		String str5=driver.findElement(By.xpath(".//*[@class='Update_News_wrap']/div[2]/ul")).getText();
		
		
	System.out.println(str5);
	
		
	}
}

package com.testngexamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandlerTest {

	WebDriver driver;
	
	
	@Test
	public void allWindows() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.xpath("//*[@id='topnavHP']/li[4]")).click();
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows.size());
		Iterator<String> itr =Allwindows.iterator();
		//Iterator itr=Allwindows.iterator();
				
		String window1=itr.next();
		String window2=itr.next();
		System.out.println("str1"+window1+"str2"+window2);
		
		driver.switchTo().window(window2);
		String msg=driver.findElement(By.xpath("//*[@class='content-ele']/p")).getText();
		System.out.println(msg);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(window1);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		String msg2=driver.getTitle();
		System.out.println(msg2);
		Thread.sleep(2000);
		driver.quit();
	
	} 
	
	
}

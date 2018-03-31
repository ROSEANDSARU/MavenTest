package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGdataP {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://scgi.half.ebay.com/ms/ebayISAPI.dll?registerenterInfo");
		
		
	}
	
	
	@DataProvider
	public void getData(){
		
		
		
		
	}
	
	
	@Test
	public void halfEbyTest(String firstName,String LastName,String address1,String address2,String city,String state,String zipcode,String email,String retypeemail){
		
		
		driver.findElement(By.xpath(".//*[@id='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("LastName");
		driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys(address1);
		driver.findElement(By.xpath(".//*[@id='address2']")).sendKeys(address2);
		driver.findElement(By.xpath(".//*[@id='city']")).sendKeys(city);
		driver.findElement(By.xpath("")).sendKeys(address2);
		driver.findElement(By.xpath(".//*[@id='zip']")).sendKeys(zipcode);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='retype_email']")).sendKeys(retypeemail);
		driver.findElement(By.xpath("")).sendKeys(address2);
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	
}

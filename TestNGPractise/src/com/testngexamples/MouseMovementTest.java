package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementTest {
	
	WebDriver driver ;
	@Test
	public void mousemoventTest() throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("http://www.spicejet.com/");
	
	Actions actions =new Actions(driver);
	Thread.sleep(3000);
	//actions.moveToElement(driver.findElement(By.xpath(".//*[@class='burger-bread']"))).build().perform();
	actions.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
	Thread.sleep(3000);
	actions.moveToElement(driver.findElement(By.xpath(".//*[@class='li-login float-right']/ul/li[2]/a"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//a[contains(text(),'Sign up')]")).click();
	//driver.findElement(By.xpath(".//*[@id='smoothmenu1']/ul/li[13]/ul/li[3]/a")).click();
	//actions.moveToElement(driver.findElement(By.xpath(".//*[@id='smoothmenu1']/ul/li[13]/ul/li[3]/a"))).build().perform();
//	driver.findElement(By.xpath(".//*[@class='burger-bread']")).click();
	
		}
	

}

package com.testngexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropTest {
	
	
	WebDriver driver ;
	@Test
	public void mousemoventTest() throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	Actions actions =new Actions(driver);
	actions.clickAndHold(driver.findElement(By.xpath(".//*[@id='draggable']/p"))).moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']"))).release().build().perform();
	Thread.sleep(3000);
	System.out.println("");
	
//	driver.findElement(By.xpath(".//*[@class='burger-bread']")).click();
	
		}
	

}

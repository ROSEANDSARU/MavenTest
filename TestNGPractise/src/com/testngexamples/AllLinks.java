package com.testngexamples;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AllLinks {

	WebDriver driver;
	
	public void allLinks(){
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	List <WebElement> alllinks = driver.findElements(By.xpath("//a"));
	System.out.println(alllinks.size());
	Iterator itr = alllinks.iterator();
	
	while(itr.hasNext()) {
	   // System.out.println(itr.next());
	    
	   WebElement wl= (WebElement) itr.next();
	  System.out.println(wl.getText());
	System.out.println("++++++++++++");  
	 // String str = (String) itr.next();
	  //System.out.println(str);
	  // wl.getText();
	}
	
	/*for(int i=0;i<alllinks.size();i++)
	{
		
		System.out.println(alllinks.get(i).getText());
	}*/
	
	/*System.out.println(itr);
	System.out.println(alllinks);
*/
	}
}

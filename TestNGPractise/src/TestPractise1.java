import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class TestPractise1 {
	
	WebDriver driver;
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(850, 550));
		//System.out.println(driver.manage().window().getSize());
		System.out.println("print dimension");
		Dimension  d =driver.manage().window().getSize();
		System.out.println(d+"next");
		Set<Cookie> cookeelist=driver.manage().getCookies();
		driver.get("http://flipkart.com/");
		System.out.println(cookeelist.size());
		Cookie name = new Cookie("mycookie", "123456789123");
		driver.manage().addCookie(name);
		Set<Cookie> cookeelist1=driver.manage().getCookies();
		System.out.println(cookeelist1.size());
		for(Cookie getCookies : cookeelist1)
		{
			
			System.out.println(getCookies);
		}
		
		
		
		
	}
	

}

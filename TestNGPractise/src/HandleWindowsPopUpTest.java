import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowsPopUpTest {

	WebDriver driver ;
	@Test
	public void handlePopUpTest() throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("http://www.popuptest.com/goodpopups.html");
	System.out.println(4+5);
	driver.findElement(By.xpath(".//a[contains(text(),'Good PopUp #3')]")).click();
	Set<String>windows=driver.getWindowHandles();
			Iterator<String> it=windows.iterator();
			do{
			System.out.println(driver.getTitle());
			it.next();
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}while(it.hasNext());
			
				
	
	}
	
}

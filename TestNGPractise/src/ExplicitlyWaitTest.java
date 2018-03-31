import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyWaitTest {

	WebDriver driver ;
	@Test
	public void navigateTest() throws Exception{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	clickWaitOn(driver, driver.findElement(By.xpath(".//input[@value='Log In']")), 1);
	System.out.println(4+5);
	}
	
	
	public static void clickWaitOn(WebDriver driver,WebElement locator,int timeout){
		
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(locator));
		//new WebDriverWait(driver, 1).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(locator));
	}
}

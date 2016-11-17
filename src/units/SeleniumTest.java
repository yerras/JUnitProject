package units;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\yerras\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	
	private static FirefoxDriver driver;
	WebElement element;
	
	
	@BeforeClass
	public static void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	
	public void validateUserCredentials(){
		System.out.println("Startinng Test "+ new Object(){}.getClass().getEnclosingMethod().getName());
		driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("testuser");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
		
		try{
			element = driver.findElement(By.xpath(".//P[id='account_logout']/a"));
		}catch (Exception e){
			
		}
		
		Assert.assertNotNull(element);
		System.out.println("Ending Test "+ new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@AfterClass
	
	public static void closeBrowser(){
		driver.quit();
	}
	

}

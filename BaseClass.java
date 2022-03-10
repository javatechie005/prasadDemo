package FeedTestCases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	
	WebDriver driver;
	String url="https://www.hackerrank.com/";
	
	
	@BeforeSuite
public void setup() throws IOException {
		
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	    	
	    }
	    @AfterSuite
public void tearDown() {
	
	driver.close();
}
	
	    
	@Test
   public void testcase1() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();
	   
   }

}

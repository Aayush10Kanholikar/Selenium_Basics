package day6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg5 {
	WebDriver driver;
	
	@Test
	 public void enterUrl() {
		 System.out.println("Test case 1");
		 driver.get("https://www.facebook.com/");
	 }
	 @BeforeMethod
	 public void openBrowser() {
		 System.out.println("Browser is opened");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	 }
	 @AfterMethod
	 public void closeBrowser() {
		 System.out.println("Browser is closed");
		 driver.close();
		 
	 }
	 @Test
	 public void enterUrl2() {
		 System.out.println("Test case 2");
		 driver.get("https://www.flipkart.com/");
	 }

}

package day6;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg4 {
	@Test
	 public void enterUrl() {
		 System.out.println("Test case 1");
	 }
	 @BeforeMethod
	 public void openBrowser() {
		 System.out.println("Browser is opened");
	 }
	 @AfterMethod
	 public void closeBrowser() {
		 System.out.println("Browser is closed");
		 
	 }
	 @Test
	 public void enterUrl2() {
		 System.out.println("Test case 2");
	 }

}

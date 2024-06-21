package day6;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg6 {
	@Test
	public void enterUrl() {
		System.out.println("Test case 1");
		
	}
	@Test
	public void enterUrl2() {
		System.out.println("Test case 2");
		
	}
	@BeforeSuite
	public void OpenBrowser() {
		System.out.println("Browser is opened");
		
	}
	@AfterSuite
	public void CloseBrowser() {
		System.out.println("Browser is closed");
		
	}

}

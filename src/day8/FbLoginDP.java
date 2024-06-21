package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLoginDP {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="dataset")
	public void login(String un, String pass, int test) {
		System.out.println(un+"===>"+pass+"===>"+test);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}
	@DataProvider(name="dataset")
	public Object[][] dpMethod(){
		return new Object[][] {
			{"username 1","password 1",1},
			{"username 2","password 2",2},
			{"username 3","password 3",3}
		};
	}

}

package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSignup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("demoname");
		driver.findElement(By.name("lastname")).sendKeys("demolastname");
		driver.findElement(By.name("reg_email__")).sendKeys("demoemail@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("demoemail@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("demo123@123");
		
		
		
		
		

	}

}

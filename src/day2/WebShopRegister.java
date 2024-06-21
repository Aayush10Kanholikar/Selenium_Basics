package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopRegister {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aayush");
		driver.findElement(By.id("LastName")).sendKeys("Kanholikar");
		driver.findElement(By.id("Email")).sendKeys("whysosadbaby2@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abc@123");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).clear();
		
//		driver.findElement(By.id("register-button")).click();
//		driver.findElement(By.className("button-1 register-continue-button")).click();
//
		}
	
}

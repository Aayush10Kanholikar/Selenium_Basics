package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShoplogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
//		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("Email")).clear();
		
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		emailTextBox.clear();
	}

}

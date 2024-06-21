package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_PathSelector {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("DEMOfirstname");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("DEMOlastname");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("DEMOemail@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("DEMOpassword");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		

	}

}

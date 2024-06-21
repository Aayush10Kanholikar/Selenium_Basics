package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean emailTextBox = driver.findElement(By.id("email")).isDisplayed();
		
		if(emailTextBox==true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		boolean PasswordBox = driver.findElement(By.id("pass")).isEnabled();
		driver.close();
		if(PasswordBox==true) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}

	}

}

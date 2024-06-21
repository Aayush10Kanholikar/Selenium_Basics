package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		emailTextBox.sendKeys("abc");
		//double click
		act.doubleClick(emailTextBox).build().perform();
		//right click
		act.contextClick(emailTextBox).build().perform();
		
		

	}

}

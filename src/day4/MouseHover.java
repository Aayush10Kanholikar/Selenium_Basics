package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement books = driver.findElement(By.linkText("BOOKS"));
//		books.click();
		
		Actions act = new Actions(driver);
		act.moveToElement(books).build().perform();
		Thread.sleep(2000);
		WebElement computers = driver.findElement(By.linkText("COMPUTERS"));
		act.moveToElement(computers).build().perform();
		

	}

}

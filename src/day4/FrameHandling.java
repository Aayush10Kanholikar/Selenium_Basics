package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		Thread.sleep(2000);
		List<WebElement> allFrames = driver.findElements(By.tagName("frame"));
		System.out.println(allFrames.size());
		
		//frame handling by index method
//		driver.switchTo().frame(0);
		
		//frame handling by name or id method
//		driver.switchTo().frame("packageListFrame");
		
		//frame handling by web_element method
		WebElement frame = driver.findElement(By.name("packageListFrame"));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.linkText("java.applet")).click();
		

	}

}

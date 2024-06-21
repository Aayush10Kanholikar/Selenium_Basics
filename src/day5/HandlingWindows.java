package day5;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow ID:"+parentWindow);
		
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println("Child Window ID:"+ childWindows);
		
		Iterator itr = childWindows.iterator();
		while(itr.hasNext()	) {
			String childWindow = (String) itr.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/app-root/app-index/div[5]/div/ul/li[3]/a")).click();
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
	}

}

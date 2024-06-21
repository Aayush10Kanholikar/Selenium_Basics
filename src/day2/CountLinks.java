package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> Links =  driver.findElements(By.tagName("a"));
		int totallinks = Links.size();
		System.out.println(totallinks);
		
		
		for(int i=0; i<totallinks; i++) {
			String links = Links.get(i).getText();
			if(links.startsWith("A")==true) {
				System.out.println(links);
			}
			
		}
	}

}

package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedTitle = "Facebook – log in or sign up";
		String actualtitle = driver.getTitle();
		
		if(expectedTitle.equals(actualtitle)) {
			System.out.println("TestCase is Passed");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.close();
		
		

	}

}

package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//WebDriver -> interface
		//driver -> instance of WebDriver / reference variable
		//ChromeDriver -> class
		
//		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); //maximizing the window
		Thread.sleep(2000);//pausing the execution for 2sec
		driver.close();

	}

}

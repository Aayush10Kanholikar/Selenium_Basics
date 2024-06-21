package day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println("Total no. of rows:"+ rows.size());
		
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		System.out.println("Total no. of rows:"+ columns.size());
		
		
		for(int r=1; r<=rows.size(); r++) {
			for(int c=1;c<=columns.size();c++) {
				String values = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(values);
				
			}
		}

	}

}

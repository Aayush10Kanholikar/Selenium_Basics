package day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider {
	@Test(dataProvider= "dataset")
	public void login(String un, String pass) {
		System.out.println(un+"===>"+pass);
	}
	
	@DataProvider(name="dataset")
	public Object[][] dpMethod(){
		return new Object[][] {
			{"username 1","password 1"},
			{"username 2","password 2"},
			{"username 3","password 3"}
		};
	}
	

}

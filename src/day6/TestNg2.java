package day6;

import org.testng.annotations.Test;

public class TestNg2 {
	
	@Test (priority=2, invocationCount=5)
	public void test() {
		System.out.println("test method");
	}
	
	@Test (priority=1)
	public void test2() {
		System.out.println("test 2 method");
	}
	
	@Test (priority=3)
	public void test3() {
		System.out.println("test 3 method");
	}
	
	@Test (priority=4)
	public void test4() {
		System.out.println("test 4 method");
	}
	
	@Test (priority=2)
	public void test5() {
		System.out.println("test 5 method");
	}
	@Test (priority=1)
	public void test6() {
		System.out.println("test 6 method");
	}

}

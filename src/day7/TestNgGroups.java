package day7;

import org.testng.annotations.Test;

public class TestNgGroups {
	@Test(groups = {"Smoke"})
	public void test() {
		System.out.println("test method");
		
	}
	@Test (groups = {"Sanity", "Smoke"})
	public void test1() {
		System.out.println("test 1 method");
	}
	@Test (groups = {"regression"})
	public void test2() {
		System.out.println("test 2 method");
	}
	@Test(groups = {"Smoke", "retesting"})
	public void test3() {
		System.out.println("test 3 method");
	}
	@Test(groups = {"Sanity"})
	public void test4() {
		System.out.println("test 4 method");
	}

}

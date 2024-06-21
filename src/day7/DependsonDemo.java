package day7;

import org.testng.annotations.Test;

public class DependsonDemo {
	@Test (dependsOnMethods = {"signUp"})
	public void login() {
		System.out.println("Login Method");
	}
	@Test
	public void signUp() {
		System.out.println("Sign in method");
	}

}

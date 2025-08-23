package com.wipro.testing;

import org.testng.annotations.Test;

public class TestNglab {
	@Test(groups = {"Smoke"})
	public void login() {
		System.out.println("login test case is executed");
	
	}
	@Test(groups = {"Regression"})
	public void paymenttest() {
		System.out.println("payment test is executed");
	}
	@Test(groups = {"Smoke","Regression"})
	public void logouttest() {
		System.out.println("logout test is executed");
	}

}

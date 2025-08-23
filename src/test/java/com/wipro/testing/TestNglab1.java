package com.wipro.testing;

import org.testng.annotations.Test;

public class TestNglab1 {
	@Test(groups = {"Sanity"})
	public void createuser() {
		System.out.println("Sanity test is executed");
	}
	@Test(groups = {"Regression"})
	public void updateuser() {
		System.out.println("Regression test is executed");
	}
	@Test(groups = {"Sanity","Regression"})
	public void deleteuser() {
		System.out.println("Sanity,Regresiion is executed");
	}
	@Test (groups = {"Smoke"})
	public void viewuser() {
		System.out.println("smoke test is executed");
	}

}

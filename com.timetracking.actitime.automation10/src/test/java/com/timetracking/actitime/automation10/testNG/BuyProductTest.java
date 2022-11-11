package com.timetracking.actitime.automation10.testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTest {
	
	@Test(priority=1)
	public void loginTest() {
		System.out.println("logged in successfully");
	}
	
	@Test(priority=2)
	public void searchForProductTest() {
		System.out.println("logged in successfully");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="searchForProductTest")
	public void addProductTest() {
		System.out.println("logged in successfully");
	}
	
	@Test(dependsOnMethods="addProductTest")
	public void addPaymentTest() {
		System.out.println("logged in successfully");
	}
	
	@Test
	public void logout() {
		System.out.println("logged in successfully");
	}
	

}

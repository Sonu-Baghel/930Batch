package com.timetracking.actitime.automation10.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupExecution {
	
		@Test(groups="smoke")
		public void loginTest() {
			System.out.println("logged in successfully");
		}
		
		@Test(groups="regression")
		public void searchForProductTest() {
			System.out.println("logged in successfully");
			Assert.fail();
		}
		
		@Test(groups="regression")
		public void addProductTest() {
			System.out.println("logged in successfully");
		}
		
		@Test(groups="smoke")
		public void addPaymentTest() {
			System.out.println("logged in successfully");
		}
		
		@Test(groups="smoke")
		public void logout() {
			System.out.println("logged in successfully");
		}
		

	}




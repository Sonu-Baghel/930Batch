package com.timetracking.actitime.automation10.testNG;

import org.testng.annotations.Test;

public class SoftAssert {
	
	@Test
	public void demo() {
		String expectedResult="abc";
		String actualResult="ewf";
		
		org.testng.Assert.softAssert  soft=new org.testng.Assert.softAssert();
		soft.assertEquals(actualResult,expectedResult);
		//soft.assertAll();
		
		

		
	
	}

}

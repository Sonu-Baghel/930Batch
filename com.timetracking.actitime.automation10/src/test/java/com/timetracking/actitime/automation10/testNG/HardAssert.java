package com.timetracking.actitime.automation10.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void demo() {
		boolean expectedResult=true;
		boolean actualResult=true;
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Pass");
	}
}

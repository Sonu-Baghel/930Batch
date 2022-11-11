package com.timetracking.actitime.automation10.testNG;

import org.testng.annotations.Test;

public class Invocation {
	@Test 
	public void demo3() {
		System.out.println("Demo3");
	}

	@Test(priority=-1)
	public void demo4() {
		System.out.println("Demo4");
	}
	
	
@Test(invocationCount=4)

	public void demo5(){
	
		System.out.println("Demo5");
	}
}
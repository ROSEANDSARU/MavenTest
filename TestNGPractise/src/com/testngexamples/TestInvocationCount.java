package com.testngexamples;

import org.testng.annotations.Test;

public class TestInvocationCount {

	
	@Test(invocationCount=10)
	public void testInvocationCount(){
		
		System.out.println("Invocation annotation");
	}
	
	@Test(invocationTimeOut=1)
	public void testInvocationCount2(){
		
		System.out.println("Invocation annotation");
	}
	
	
	@Test(invocationCount=1000,timeOut=1)
	public void timeout(){
		
		System.out.println("timeout parameter");
	}
	
	
}

package com.testngexamples;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPriority {

	
	@BeforeMethod
	public void m(){
		System.out.println("m");
	}
	
	
	@Test(groups="testgroup")
	public void m1(){
		
		System.out.println("m1");
	}
	
	
	
	@Test(priority=4,groups="testgroup")
	public void m2(){
		
		System.out.println("m2");
	}
	
	
	@Test(priority=2,groups="newgroup")
	public void m3(){
		
		System.out.println("m3");
	}
	
	
	@Test(priority=1)
	public void m4(){
		
		System.out.println("m4");
	}
	
	@Test(priority=2,groups="grouptn")
	public void m5(){
		
		System.out.println("m5");
	}
	
	
	
}

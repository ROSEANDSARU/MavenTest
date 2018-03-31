package com.testngexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	

	
	@BeforeSuite
	public void Bsuit(){
	
		System.out.println("Before Suite");
		
		
	}
	
	@BeforeClass 
	public void Bclass(){
		
		System.out.println("before class ");
	}
	
	
	@BeforeTest
	public void Btest(){
		
		System.out.println("Before Test");
		
		
	}
	
	@BeforeMethod
	public void Bmethod(){
		
		System.out.println("Before Method");
		
		
	}
	
	@BeforeGroups
	public void BGroup(){
		
		
		System.out.println("Before Group");
	}
	
	@Test
	public void MTest1(){
		
		System.out.println("@Test");
	}
	
	@Test
	public void MTest2(){
		
		System.out.println("@Test");
	}
	
	@AfterSuite
	public void Asuite(){
		
		System.out.println("After Suite");
	}
	
	@AfterClass
	public void ASuite(){
		
		System.out.println("After class");
	}
	
	@AfterGroups
	public void Agroup(){
		System.out.println("After group");
		
		
	}
	
	@AfterMethod
	public void Amethod(){
		
		System.out.println("After Method");
	}
}

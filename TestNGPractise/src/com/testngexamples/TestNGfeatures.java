package com.testngexamples;

import org.testng.annotations.Test;

public class TestNGfeatures {

@Test
public void m1(){
	System.out.println("m1");
	//int i =9/0;
}

@Test(dependsOnMethods="m1")
public void m2(){
	System.out.println("m2");
	
}

@Test
public void m3(){
	System.out.println("m3");
	
}


@Test(expectedExceptions=NumberFormatException.class)
public void m4(){
	
	String x="1000A";
	Integer.parseInt(x);
	
	
}
	
	
}

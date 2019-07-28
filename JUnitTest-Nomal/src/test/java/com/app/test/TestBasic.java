package com.app.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *  @BeforeClass & @AfterClass --->  Executes before and after all test cases . Must be static
 *   
 * 
 * 	@Before & @After ---> will execute before and after all tests  . used as set up and clean up code
 * 
 * 
 * 
 * */


public class TestBasic {

	@BeforeClass
	public static void beforeAllTests()
	{
		System.out.println("before all test cases");
	}
	
	
	@Before
	public void setup()
	{
		System.out.println("before test starts");
	}
	
	
	@Test
	public void testA()
	{
		System.out.println("Test-1");
	}

	
	
	@Test
	public void testB()
	{
		System.out.println("Test-2");
	}
	
	
	
	@Test
	public void testC()
	{
		System.out.println("Test-3");
	}
	
	
	
	@After
	public void clean()
	{
		System.out.println("after test ends");
	}
	
	
	@AfterClass
	public static void  afterAllTests()
	{
		System.out.println("after all test cases");
	}
	
	
	/*
	 * 
	 *  o/p 
	 *  		
	 *  			before all test cases
					
					before test starts
					Test-1
					after test ends
					
					before test starts
					Test-2
					after test ends
					
					before test starts
					Test-3
					after test ends
					
					after all test cases

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
}

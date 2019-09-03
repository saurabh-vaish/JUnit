package com.app.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.ArmstrongNumber;


public class TestArmstrongNumber {

	private ArmstrongNumber ob =null;

	
	@Before
	public void setUp()
	{
		ob = new ArmstrongNumber();
	}
	
	
	@Test
	public void testArmstrongNonNegative()
	{
		assertNotEquals("number is negative", -1 ,ob.armstrong(9));
	}
	
	
	@Test
	public void testArmstrongNumber()
	{
		assertTrue("number is not palimdrom",ob.checkArmstrong(1634));
	}
	
	
	@After
	public void clean()
	{
		ob = null;
	}
}

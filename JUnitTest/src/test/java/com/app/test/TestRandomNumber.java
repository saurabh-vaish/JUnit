package com.app.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.RandomNumber;


public class TestRandomNumber {

	private RandomNumber ob=null;

	
	@Before
	public void setUp()
	{
		ob = new  RandomNumber();
	}
	
	
	@Test
	public void testRandom()
	{
		int n = ob.generatreRandom();
		
		if(n<0 || n>999)
		{
			fail("not a valid random number");
		}
	}
	
	
	@After
	public void clean()
	{
		ob = null;
	}
}

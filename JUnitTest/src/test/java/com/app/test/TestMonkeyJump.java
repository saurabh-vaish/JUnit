package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.MonkeyJump;


public class TestMonkeyJump {

	private MonkeyJump ob=null;

	
	@Before
	public void setUp()
	{
		ob = new  MonkeyJump();
	}
	
	
	@Test
	public void testJump()
	{
		int n = ob.calculateJump(5,1, new int[] {10,9});
		assertEquals("jump is not currect",5,n);
	}
	
	
	@After
	public void clean()
	{
		ob = null;
	}
}

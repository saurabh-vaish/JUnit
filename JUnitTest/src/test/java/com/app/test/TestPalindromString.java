package com.app.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.PalindromString;


public class TestPalindromString {

	private PalindromString p =null;

	
	@Before
	public void setUp()
	{
		p = new PalindromString();
	}
	
	
	@Test
	public void testReverseNull()
	{
		assertNotNull("returning null value", p.strReverse(null));
	}
	
	@Test
	public void testCheckPalindrom()
	{
		Boolean b = p.checkPalim("MOM");
		assertTrue("string is not palindrom", b);
	}
	
	
	@After
	public void clean()
	{
		p = null;
	}
}

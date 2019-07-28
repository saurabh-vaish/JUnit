package com.app.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;


/***
 *   
 *    Assert API --> this api is used to validate application logic . It is also called unit testing method .
 *    				They all are static methods and follow static imports.
 *    				These methods will tell test fail or pass.
 * 
 * 	
 * 		assertEquals() --->  For primitive  , uses .equals() for comparison 
 * 
 * 		assertSame()  ---> for Objects  , uses == for comparison
 * 
 * 		assertTrue()  --> To check boolean conditions
 * 
 * 		assertNotNull()  ---> To check not null or not
 * 
 * 		fail() ---> to check conditions  in if 
 * 
 * */



public class TestAssertMethods {

	
	int a=10,b=10,c=20;
	
	String s1="cat",s2="cat";
	
	String s3=new String("Mat");

	String s4=new String("Mat");
	
	String s=null;

	
	@Test
	public void test() {
		// we can also use overloaded methods for own messages
		
		assertEquals(a,b);

		//assertEquals(a,c);
		
		assertNotEquals(a, c);
	
		
		assertSame(s1, s2);  // true as both pointing to same string in SCP

	 	//assertSame(s3, s4);
		
	
	 	assertNull("is not null",s);  // checks for null
	 	
	 	//assertNotNull("is null",s);  // checks for not null
	 	
	
	
	 	if(s3!=s4)
	 	{
	 		fail("both are different objects");
	 	}
	
	
	}

}

package com.app.test;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.model.Employee;

public class TestEmployee {

	
	private Employee e;
	
	@Before
	public void setup()
	{
		e = new Employee();
	}
	
	@Test
	public void test() {
		
		assertNotNull("test fail, mep object not created", e);
	}

	
	
	@After
	public void clean()
	{
		e=null;
	}
	
}

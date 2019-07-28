package com.app.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.model.Employee;

public class TestEmployeeSingletonCheck {

	
	private Employee e,e1,e2;
	
	@Before
	public void setup()
	{
		e = Employee.getEmployeeInstances();
		e1 = Employee.getEmployeeInstances();
		e2 = Employee.getEmployeeInstances();
	}
	
	
	// to check object is null or not
	@Test
	public void test() 
	{
		assertNotNull("employee singleton instance is not null",e); 
	}
	
	
	
	@Test
	public void TestA()
	{
		if(e1==null || e2==null)
		{
			fail("employee object not created");
		}
	}
	

	
	// to check objects are same
	
	@Test
	public void TestB()
	{
		assertSame("Employee objects are not sigleton",e1,e2);  // executes if objects are not singleton

		assertNotSame("Employee objects are  sigleton",e1,e2);   // executes if objects are singleton
	}
	
	
	@After
	public void clean()
	{
		e = null;
		e1=null;
		e2=null;
	}
	
	

}

package com.app.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.model.AppConfig;
import com.app.model.Employee;
import com.app.service.IEmployeeService;



@RunWith(SpringJUnit4ClassRunner.class)						// for integration with spring
@ContextConfiguration(classes = {AppConfig.class})			// for getting container
public class TestEmployeeService {

	@Autowired
	private IEmployeeService service;
	
	private Employee e;
	
	@Before
	public void setup()
	{
		e= new Employee(10,"AA",3.4);
	}
	
	@Test
	public void test()
	{
		assertNotNull(service);
	}
	
	
	@Test
	public void testSave() {
	
		assertEquals(e.getEmpId(), service.saveEmployee(e));
		
		assertNotNull(service.saveEmployee(e)); 				// return some value
		
		assertTrue(service.saveEmployee(e)>0);					// id should be positive
	}

	
	@Test
	public void testGet()
	{
		assertNotNull("emp not present with given id",service.getEmployee(10));
		
	}
	
	
	@Test
	public void testGetAll()
	{
		List<Employee> list = service.getAll();
		
		assertNotNull(list);				// list is not null
		
		assertTrue(list!=null);				// list is not empty
		
		assertEquals(3,list.size() );		// matching with list size and db size
	}
	
	
	@Test
	public void testDelete()
	{
		assertEquals(new Integer(10), service.deleteEmployee(10));
	}
	
	
	
	
}

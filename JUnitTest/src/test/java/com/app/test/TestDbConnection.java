package com.app.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.DbConnection;


public class TestDbConnection {

	private Connection con1=null;
	private Connection con2=null;

	
	@Before
	public void setUp() throws ClassNotFoundException, SQLException
	{
		con1 = DbConnection.getConnection();
		con2 = DbConnection.getConnection();
	}
	
	
	@Test
	public void testSingleton()
	{
		assertSame("Connection is not sigleton", con1, con2);
	}
	
	@Test
	public void testDbConnection()
	{
		assertNotNull("connection object is not created", con1);
		assertNotNull("connection object is not created", con2);
	}
	
	
	@After
	public void clean()
	{
		con1 = con2 = null;
	}
}

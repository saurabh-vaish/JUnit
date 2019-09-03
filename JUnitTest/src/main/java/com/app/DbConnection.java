package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection implements Cloneable {

	private static Connection con = null;
	
	private DbConnection()
	{
		
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		if(con==null)   // first stage null check
		{
			synchronized (DbConnection.class) {
				
				if(con==null)   // second null checking 
				{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springboot","root","root");
				}
			}
		}
		
		return con;
	}
	
	
	// prevent cloning of object 
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException();
	}
	
}

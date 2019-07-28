package com.app.model;

/**
 *  Since every bean scope in spring is by default singleton . But if a bean is configured two times then it will create two objects
 *  
 *  To overcome this problem we use singleton design pattern .
 * 	
 * 	here double checking is used to make it truly singleton
 * 
 * */

public class Employee implements Cloneable{
	
	public static Employee e =null;
	
	
	private Employee()
	{
		System.out.println("from const");
	}
	
	
	public static Employee getEmployeeInstances()
	{
		if(e==null)		// level 1
		{
			synchronized (Employee.class)  // only one thread at a time 
			{
				if(e==null)			// 2nd level
				{
					e = new Employee();
				}
			}
		}
		
		return e;
	}
	
	
	
	// to prevent object to be clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException();
	}
	
	
}

package com.app.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.model.AppConfig;
import com.app.model.MyTemplate;




@RunWith(SpringJUnit4ClassRunner.class)     			// to integrate with spring
@ContextConfiguration(classes = {AppConfig.class})     // to get spring container
public class TestAppConfig {

	@Autowired
	private MyTemplate temp;
	
	
	@Test
	public void testA() {
	
		assertNotNull("Object Not Created",temp);
	}

	
	@Test
	public void testB()
	{
		int a = temp.getSessId();
		assertEquals(150, a);
	}
	
	
}

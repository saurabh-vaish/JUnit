package com.app.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.CaptchaGenerator;


public class TestCaptchaGenerator {

	private CaptchaGenerator ob =null;

	
	@Before
	public void setUp()
	{
		ob = new CaptchaGenerator();
	}
	
	
	@Test
	public void testCaptchaNull()
	{
		assertNotNull("captcha is null",ob.generatreCaptcha());
	}
	
	@Test
	public void testCaptchaSame()
	{
		assertNotEquals("generating same captcha",ob.generatreCaptcha(),ob.generatreCaptcha());
	}
	
	
	@After
	public void clean()
	{
		ob = null;
	}
}

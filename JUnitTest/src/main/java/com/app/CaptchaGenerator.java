package com.app;

import java.util.UUID;

public class CaptchaGenerator {

	
	public String generatreCaptcha()
	{
		String s = "" + UUID.randomUUID().getMostSignificantBits(); 
		return s.substring(2, 6);
	}
	
	
}

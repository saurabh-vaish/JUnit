package com.app;


public class PalindromString {

	
	public String strReverse(String s)
	{
		return (s!=null)?new StringBuilder(s).reverse().toString():"";
	}
	
	
	public boolean checkPalim(String s)
	{
		return s.equals(strReverse(s));
	}
	
	
}

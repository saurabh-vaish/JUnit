package com.app;

public class ArmstrongNumber {

	
	public int armstrong(int n)
	{
		if(n>=0)
		{
			int len = String.valueOf(n).length();
			int sum=0;
			while(n>0)
			{
				int rem = n%10;
				sum = (int) (sum + Math.pow(rem, len));
				n = n/10;
			}
			return sum;
		}
		else
		{
			return -1;
		}
	}
	
	
	public boolean checkArmstrong(int num)
	{
		return num==armstrong(num);
	}
	
	
}

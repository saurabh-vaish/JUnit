package com.app;

public class MonkeyJump {

	
	public int calculateJump(int jump,int slip,int[] walls)
	{
		int totalJump=0;
		int currentHeight = 0;
		
		for(int i=0;i<walls.length;i++)
		{
			if ( jump >= walls[i])
			{
				totalJump++;
			}
			else {
				do
				{
					totalJump++;
					
					currentHeight += jump-slip;
					int nextJump = currentHeight + jump;
					
					if(nextJump>=walls[i])
					{
						totalJump++;
						break;
					}
					else {
						currentHeight = currentHeight - slip;
					}
				}
				while(currentHeight<walls[i]);
			}
		}
		
		return totalJump;
		
	}
	
	
}

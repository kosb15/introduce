package com.kosb.chap2;

public class ImpeCalculator implements Calculator{
	
	long result =1;
	@Override
	public Object factorial(long num)
	{
		
		for(int i=1;i<=num;i++)
		{
			result *= i;
		}
		
		return (Long)result;
		
	}
	

	
}

package com.kosb.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kosb.chap2.Calculator;

public class MainXmlAspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopPojo.xml");
		
		Calculator impeCal = ctx.getBean("impeCal",Calculator.class);
		Long fiveFact = (Long)impeCal.factorial(5);
		System.out.println("impeCal.factorial(5)_1 = "+ fiveFact);
		fiveFact = (Long)impeCal.factorial(5);
		System.out.println("impeCal.factorial(5)_2 = "+ fiveFact);
		
	}

}

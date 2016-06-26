package com.kosb.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kosb.chap2.Calculator;

public class MainXmlPojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopPojo.xml");
		
		Calculator impeCal = ctx.getBean("impeCal",Calculator.class);
		Object fiveFact1 = impeCal.factorial(5);
		System.out.println("impe fac1(5) : "+ fiveFact1);
		
		
	}

}

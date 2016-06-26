package com.kosb.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kosb.chap2.Calculator;

import config.JavaConfig;

public class MainJavaAspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.JavaConfig.class);
		
		Calculator impCal = ctx.getBean("impeCal",Calculator.class);
		//long five = impCal.factorial(6);
		//System.out.printf("impCal.factorial(6) : "+five);
	
	}

}

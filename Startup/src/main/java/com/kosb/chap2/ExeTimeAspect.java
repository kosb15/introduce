package com.kosb.chap2;

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class ExeTimeAspect {
	
	public Object measure(ProceedingJoinPoint joinpoint) throws Throwable{
		long start = System.nanoTime();
		
		
		Object result = joinpoint.proceed();
		
			long  finish = System.nanoTime();
			Signature sig = joinpoint.getSignature();
			System.out.printf("%s.%s(%s) 실행 시간 : %d ns\n",joinpoint.getTarget().getClass().getSimpleName(),sig.getName(),Arrays.toString(joinpoint.getArgs()),finish-start);
			return result;
		
	}

}

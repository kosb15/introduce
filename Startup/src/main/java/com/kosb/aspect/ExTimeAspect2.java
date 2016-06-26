package com.kosb.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)
public class ExTimeAspect2 {

	@Pointcut("execution(public * com.kosb.chap2..*(..))") 
	public void publicTarget() {

	}

	@Around("publicTarget()") // 전후로 order=0으로 공통기능을 실행한다.
	public Object measure(ProceedingJoinPoint joinpoint) throws Throwable {

		long start = System.nanoTime();
		Object result;
				// 전 
			 result = joinpoint.proceed(); // 핵심 기능을 공통기능 전,후로 실행한다.
			 	// 후로 공통 기능을 실행한다.
		
			long finish = System.nanoTime();
			Signature sig = joinpoint.getSignature();
			System.out.printf(" 실행 시간 : %d ns\n",  finish - start);
			return result;
		

	}

}

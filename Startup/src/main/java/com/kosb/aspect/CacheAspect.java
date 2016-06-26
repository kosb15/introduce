package com.kosb.aspect;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class CacheAspect {
	
	private Map <Long,Object> cache = new HashMap<>();
	
	@Pointcut("execution(public * com.kosb.chap2*..*(..))")
	public void Target(){
		
	}
	
	@Around("Target()")
	public Object excution(ProceedingJoinPoint joinpoint) throws Throwable{
		
		Long num = (Long)joinpoint.getArgs()[0];
		if(cache.containsKey(num)){
			System.out.printf("CacheAspect: Cashe에서 구함[%d]\n",num);
			return cache.get(num);
		}
		
		Object result = joinpoint.proceed();
		cache.put(num, result);
		System.out.printf("CacheAspect: Cashe에 추가[%d]\n",num);
		return result;
	}

}

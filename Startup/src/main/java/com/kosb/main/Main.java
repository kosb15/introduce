package com.kosb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kosb.chap1.MemberInfoPrinter;
import com.kosb.chap1.MemberRegisterService;
import com.kosb.chap1.RegisterRequest;

import config.JavaConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 컨테이너를 띄우는 작업이다.
		// 기존의 GenericXmlApplicationContext(스프링이 컨테이너 작업을 모두 처리해준다..) 와 다르게 자바로 컨테이너를 직접 구현하였고, @Configuration 어노테이션을 이용해 컨테이너 구현하였다.
		// 따라서, AnnotationConfigApplicationContext 으로 컨테이너를 만든다.
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class); 
		
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc",MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter",MemberInfoPrinter.class);
		
		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("kosb15@gmail.com");
		regReq.setName("최범균");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);
		
		infoPrinter.printMemberInfo(regReq.getEmail());
		
	}

}

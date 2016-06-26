package com.kosb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kosb.chap1.MemberInfoPrinter;
import com.kosb.chap1.MemberRegisterService;
import com.kosb.chap1.RegisterRequest;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ctx =new GenericXmlApplicationContext("classpath:main-conf.xml");
		
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc",MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter",MemberInfoPrinter.class);
		
		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("kosb14@gmail.com");
		regReq.setName("오가람");
		regReq.setPassword("2223123tmd");
		regReq.setConfirmPassword("2223123tmd");
		regSvc.regist(regReq);
		
		infoPrinter.printMemberInfo("kosb14@gmail.com");
		
		
		

	}

}

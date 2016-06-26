package com.kosb.chap1;

import org.springframework.beans.factory.annotation.Autowired;

import config.ConfigPart2;

public class MemberInfoPrinter {
	
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	
	@Autowired
	public void setMemberDao(MemberDao memberDao)
	{
		this.memberDao = memberDao;
		
	}
	
	@Autowired
	public void setPrinter(MemberPrinter printer) // bean 하나 당 하나의 bean 객체를 만든다. => 싱글톤 -> 객체를 하나만 생성하고 해당 객체의 주소만 넘겨줘서, 하나의 객체에 모두 주소로 접근이 가능하다.
	{
		this.printer = printer;
		
	}
	
	public void printMemberInfo(String email)
	{
		
		Member member = memberDao.selectByEmail(email);
		if(member == null)
		{
			System.out.println("데이터 없음.\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

}

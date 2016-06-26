package com.kosb.chap1;

import java.util.Collection;

public class MemberListPrinter {
	
	private MemberDao memberdao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberdao,MemberPrinter printer)
	{
		this.memberdao = memberdao;
		this.printer = printer;
	}
	
	public void printAll()
	{
		Collection<Member> members = memberdao.selectAll();
		for(Member m : members){
			printer.print(m);
		}
	}

}

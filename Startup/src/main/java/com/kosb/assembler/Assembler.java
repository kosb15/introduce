package com.kosb.assembler;

import com.kosb.chap1.ChangePasswordService;
import com.kosb.chap1.MemberDao;
import com.kosb.chap1.MemberRegisterService;

public class Assembler {
	
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler(){
		this.memberDao = new MemberDao();
		this.regSvc = new MemberRegisterService(memberDao);
		this.pwdSvc = new ChangePasswordService(memberDao);
	}
	
	public MemberDao getMemberDao(){
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService(){
		return regSvc;
	}
	
	public ChangePasswordService getChangePasswordService(){
		return pwdSvc;
	}

}

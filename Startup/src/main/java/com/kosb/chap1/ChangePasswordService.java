package com.kosb.chap1;

public class ChangePasswordService {
	
	private MemberDao memberDao;

	public ChangePasswordService(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}
	
	
	public void changePassword(String email,String oldPwd,String newPwd)
	{
		Member member = memberDao.selectByEmail(email);
		
		if(member == null)
		{throw new MemberNotFoundException();}
		
		member.changePassword(oldPwd, newPwd);
		
		memberDao.update(member);
	}

}

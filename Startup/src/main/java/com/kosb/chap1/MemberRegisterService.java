package com.kosb.chap1;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {
	
	
	private MemberDao memberDao;

	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	public MemberRegisterService() {
	}
	
	public void regist(RegisterRequest req)
	{
		Member member = memberDao.selectByEmail(req.getEmail());
		if(member != null)
			throw new AlreadyExistingMemberException("dup email "+req.getEmail());

		member = new Member(req.getEmail(),req.getPassword(),req.getName(),new Date());
		memberDao.insert(member);
	}
	
	

}

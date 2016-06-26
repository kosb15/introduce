package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kosb.chap1.MemberDao;
import com.kosb.chap1.MemberInfoPrinter;
import com.kosb.chap1.MemberPrinter;
import com.kosb.chap1.MemberRegisterService;

@Configuration // 해당 클래스를 컨테이너로 쓰겠다는 의미
public class JavaConfig2 {
	
	@Bean // 해당 컨테이너에 Bean을 등록
	public MemberDao memberDao(){
		return new MemberDao(); // 해당 클래스가 컨테이너이므로, 의존주입과 객체생성을 직접 구현해야한다.
	}
	
	@Bean 
	public MemberRegisterService memberRegSvc(){
		return new MemberRegisterService();
	}
	
	@Bean
	public MemberPrinter printer()
	{
		return new MemberPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter()
	{
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
		
	}

}

package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.kosb.chap1.MemberDao;
import com.kosb.chap1.MemberRegisterService;

@Configuration // 컨테이너 내부에 Import된 클래스까지 설정클래스로 등록을 한다.
@Import(ConfigPart2.class) // 컨테이너에 두 클래스를 모두 설정 클래스(@Configuration)로 등록한다.
public class ConfigPart1 {
	
	
	
	@Bean // 해당 컨테이너에 Bean을 등록
	public MemberDao memberDao(){
		return new MemberDao(); // 해당 클래스가 컨테이너이므로, 의존주입과 객체생성을 직접 구현해야한다.
	}
	
	@Bean 
	public MemberRegisterService memberRegSvc(MemberDao memberDao){
		return new MemberRegisterService(memberDao);
	}

	
}

package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.kosb.chap1.MemberDao;
import com.kosb.chap1.MemberInfoPrinter;
import com.kosb.chap1.MemberPrinter;
import com.kosb.chap1.MemberRegisterService;

public class ConfigPart2 {

	// @Autowired // 컨테이너 내부에 존재하므로 바로 가져다 쓸 수 있다.
	// ConfigPart1 configPart1; // 해당 클래스가 컨테이너 내부에 있는 설정 클래스이므로 모두 자동 주입이 가능하다.

	@Autowired
	MemberDao memberDao;

	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {

		return new MemberRegisterService(memberDao);

	}

}

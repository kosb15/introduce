package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.kosb.aspect.ExTimeAspect2;
import com.kosb.chap2.Calculator;
import com.kosb.chap2.ImpeCalculator;

@Configuration // 해당 클래스를 컨테이너로 쓰겠다는 의미
@EnableAspectJAutoProxy
public class JavaConfig {
	
	@Bean // 해당 aspect가 설정된 bean 객체를 찾아서 자동으로 aop를 등록한다.
	public ExTimeAspect2 exeTimeAspect(){
		return new ExTimeAspect2();
	}

	@Bean
	public Calculator impeCal(){
		return new ImpeCalculator();
	}
}

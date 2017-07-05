package kr.or.connect.springExam.config;

import org.springframework.context.annotation.*;

import kr.or.connect.springExam.examples.*;

@Configuration
@ComponentScan(basePackages = "kr.or.connect.springExam")
public class ApplicationContextConfig {
	
	@Bean
	public String name() {
		return "joon";
	}
	
	@Bean
	public User user3() {
		User user = new User(name());
		return user;
	}
	
	@Bean
	public User user4() {
		User user = new User("홍길동");
		return user;
	}
}

package kr.or.connect.springExam.config;

import org.springframework.context.annotation.*;

import kr.or.connect.springExam.examples.*;

@Configuration
public class ApplicationContextConfig {
	
	@Bean
	public String name() {
		return "joon";
	}
	
	@Bean
	public User user() {
		User user = new User(name());
		return user;
	}
	
}

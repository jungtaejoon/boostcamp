package kr.or.connect.springExam.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "kr.or.connect.springExam")
public class ApplicationContextConfig {
	
	@Bean
	public String name() {
		return "joon";
	}
}

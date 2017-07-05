package kr.or.connect.springExam;

import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

import kr.or.connect.springExam.config.*;

public class SpringApplication {
	private static final String CONTEXT_PATH = "applicationContext.xml";
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(CONTEXT_PATH);
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		String name = (String)context.getBean("name");
		String name2 = (String)context2.getBean("name");
		
		System.out.println("name : " + name);
		System.out.println("name2 : " + name2);
		
		context.close();
		context2.close();
	}

}

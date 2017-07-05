package kr.or.connect.springExam;

import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

import kr.or.connect.springExam.config.*;
import kr.or.connect.springExam.examples.*;

public class SpringApplication {
	private static final String CONTEXT_PATH = "applicationContext.xml";
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(CONTEXT_PATH);
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		String name = (String)context.getBean("name");
		String name2 = (String)context2.getBean("name");
		
		User user1 = (User)context.getBean("user1");
		User user2 = (User)context.getBean("user2");
		User user3 = (User)context2.getBean("user3");
		User user4 = (User)context2.getBean("user4");
		
		System.out.println("name : " + name);
		System.out.println("name2 : " + name2);
		System.out.println("user1.getName : " + user1.getName());
		System.out.println("user2.getName : " + user2.getName());
		System.out.println("user3.getName : " + user3.getName());
		System.out.println("user4.getName : " + user4.getName());
		
		context2.close();
		context.close();
	}

}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach aCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(aCoach == theCoach);
		System.out.println(theCoach);
		System.out.println(aCoach);
		
		context.close();
	}
}

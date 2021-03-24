package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are same beans
		boolean result = (theCoach == alphaCoach);
		System.out.println("\npointing to the same object: " + result);
		System.out.println("\nMemory location theCoach: " + theCoach);
		System.out.println("\nMemory location aplphaCoach: " + alphaCoach);
		
		context.close();
	}
}

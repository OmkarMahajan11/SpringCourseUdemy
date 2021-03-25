package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read the spring config java class
		AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}

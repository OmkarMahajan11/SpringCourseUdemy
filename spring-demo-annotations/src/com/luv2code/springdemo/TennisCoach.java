package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	// constructor injection
	@Autowired
	public TennisCoach(FortuneService f) {
		fortuneService = f;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// init method
	@PostConstruct
	public void doStartupStuff() {
		System.out.println(">> TennisCoach: inside doStartupStuff() method");
	}
	
	// destroy method
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println(">> TennisCoach: inside doCleanupStuff() method");
	}
	
	/*
	// setter injection
	@Autowired
	public void setFortuneService(FortuneService f) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		fortuneService = f;
	}
	
	// any method can be used for injection
	@Autowired
	public void doIt(FortuneService f) {
		System.out.println(">> TennisCoach: inside doIt() method");
		fortuneService = f;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	
}

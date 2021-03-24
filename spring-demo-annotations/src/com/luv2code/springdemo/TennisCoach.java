package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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

package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define a construction for injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add a init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: init method");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: destroy method");
	}
}

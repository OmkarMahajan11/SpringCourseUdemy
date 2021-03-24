package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Beware of wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random rand = new Random();
	
	@Override
	public String getDailyFortune() {
		int index = rand.nextInt(data.length);
		return data[index];
	}
}

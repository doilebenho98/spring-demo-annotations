package com.luancode.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	

	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: insiden setfortuneService () method");
//		}
//	
//	@Autowired
//	public void newbirter(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: insiden newbirter () method");
//	}
//	
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: insiden default khoi tao ham");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: insiden of doMyStartupStuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println("TennisCoach: insiden of doCleanupStuff");
	}

	@Override
	public String getDailWorkout() {

		return " Practice your backhand volley";
	}

	@Override
	public String getDailyFotune() {

		return fortuneService.getFortune();
	}

}

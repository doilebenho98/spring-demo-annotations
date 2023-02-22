package com.luancode.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuenService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your luky day!";
	}

}

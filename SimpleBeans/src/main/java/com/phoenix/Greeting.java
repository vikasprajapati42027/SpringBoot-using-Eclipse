package com.phoenix;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Greeting {
	@Value("Happy BirthDay!")
	private String message;

	public Greeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Greeting object is created");
	}

	public String greet() {
		return message;
	}
}

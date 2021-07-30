package com.phoenix.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.phoenix.Greeting;
import com.phoenix.spring.config.SpringConfig;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Greeting gt=context.getBean(Greeting.class);
		System.out.println(gt.greet());
	}

}

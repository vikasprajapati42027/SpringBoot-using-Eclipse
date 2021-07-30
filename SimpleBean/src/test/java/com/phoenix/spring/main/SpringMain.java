package com.phoenix.spring.main;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.phoenix.bean.Greeting;
import com.phoenix.spring.config.SpringConfig;

public class SpringMain {
	
	public static void main(String[]args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Greeting gt=context.getBean(Greeting.class);
		System.out.println(gt.greet());
	}

}
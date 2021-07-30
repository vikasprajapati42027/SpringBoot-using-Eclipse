package com.phoenix.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.phoenix.di.config.PerformerConfig;
import com.phoenix.di.performers.Performer;

/*
 * @author : vikas.prajapti@stltech.in
 * @version 1.0
 * @Date 29-07-2021
 * @copyright : Sterlite Technology Ltd.
 */

public class SterliteIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating spring Ioc Container object
		ApplicationContext context = new AnnotationConfigApplicationContext(PerformerConfig.class);

		// Fetchng application object from spring Ioc Container
		Performer p = context.getBean("Pyaare_Mohan", Performer.class);

		// Invoke business ogin method
		p.Perform();

		Performer s = context.getBean("singer", Performer.class);
		s.Perform();
	}

}

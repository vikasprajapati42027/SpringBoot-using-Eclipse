package com.phoenix.di.instruments;
/*
 * @author : vikas.prajapti@stltech.in
 * @version 1.0
 * @Date 29-07-2021
 * @copyright : Sterlite Technology Ltd.
 */
import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
       System.out.println("Ting ting ting....");
	}

	 public Guitar() {
		// TODO Auto-generated constructor stub
	 System.out.println("Guiter is created");
	 }
}

package com.phoenix.di.performers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
/*
 * @author : vikas.prajapti@stltech.in
 * @version 1.0
 * @Date 29-07-2021
 * @copyright : Sterlite Technology Ltd.
 * @description Instrumentalist is a dependent object which
 *           depends on Dependency Object Instrument
 */
import org.springframework.stereotype.Component;

import com.phoenix.di.instruments.Instrument;

@Component("Pyaare_Mohan")
public class Instrumentalist implements Performer {

	//Dependency
	@Autowired  // ->used to achive Dependency Injection for complex property
	private  Instrument instrument;
	
	@Value("Nile Nile Ambar Pe....") //-> used to inject value in simple  property
	private String song;
	
	/*
	 * public Instrumentalist() { // TODO Auto-generated constructor stub
	 * System.out.println("Instumentalist created"); }
	 */
	
	
	//Business logic method of Performer
	@Override
	public void Perform() {
		// TODO Auto-generated method stub

		System.out.println("instrumentalist is playing a song "+ song);
		instrument.play();
	}

}

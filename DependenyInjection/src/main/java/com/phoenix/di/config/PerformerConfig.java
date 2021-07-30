package com.phoenix.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @author : vikas.prajapti@stltech.in
 * @version 1.0
 * @Date 29-07-2021
 * @copyright : Sterlite Technology Ltd.
 */

@Configuration
@ComponentScan(basePackages= {"com.phoenix.di.instruments","com.phoenix.di.performers"})
public class PerformerConfig {

	
}

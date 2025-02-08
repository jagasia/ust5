package com.ust.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com"})
public class MyConfiguration {

	@Bean
	public Mathematics maths()
	{
		return new Mathematics(100, 200);
	}
}

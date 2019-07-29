package com.app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app")
public class AppConfig {

	
	@Bean
	public MyTemplate temp()
	{
		return new MyTemplate(150);
	}
	
	
}

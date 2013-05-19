package com.hmkcode.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hmkcode.vo.Person;

@Configuration
@Profile("development")
public class SpringConfig {

  @Bean
	public Person person(){
		return new Person();
	}
}

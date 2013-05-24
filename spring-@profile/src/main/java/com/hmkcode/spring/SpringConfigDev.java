package com.hmkcode.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hmkcode.vo.Person;

@Configuration
@Profile("development")
public class SpringConfigDev {

  @Bean
  public Person person(){
	  
	  Person person =  new Person();
	  person.setId(1);
	  person.setName("dev-person");
	  
	  return person;
  }
}
package com.hmkcode.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hmkcode.vo.Person;

@Configuration
@Profile("production")
public class SpringConfigPro {

  @Bean
  public Person person(){
	  
	  Person person =  new Person();
	  person.setId(2);
	  person.setName("pro-person");
	  
	  return person;
  }
}
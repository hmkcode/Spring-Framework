package com.hmkcode.spring.mybatis.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import com.hmkcode.spring.mybatis.mapper.Mapper;
import com.hmkcode.spring.mybatis.vo.Person;

public class Service {
  
  @Autowired 
  private Mapper mapper;

  
  @SuppressWarnings("unchecked")
  public List<Person> selectAllPerson() {
  	return mapper.selectAllPerson();
  }
  
  @SuppressWarnings("unchecked")
  public Person selectPerson(int id) {
  	return mapper.selectPerson(id);
  }
  
  public void insertPerson(Person person){
	  mapper.insertPerson(person);
  }
  
  public List<Person> selectAllPerson2(){
	  return mapper.selectAllPerson2();
  }
  

}

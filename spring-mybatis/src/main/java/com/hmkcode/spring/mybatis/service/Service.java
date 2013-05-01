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

 
  public List<Person> selectAllPerson() {
  	return mapper.selectAllPerson();
  }
  public Person selectPerson(int id) {
  	return mapper.selectPerson(id);
  }
  public int insertPerson(Person person){
	return mapper.insertPerson(person);
  }
}

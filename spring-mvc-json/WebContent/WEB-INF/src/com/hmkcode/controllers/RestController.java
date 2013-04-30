package com.hmkcode.controllers;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmkcode.vo.Person;

@Controller
@RequestMapping("/cont")
public class RestController {

  public RestController(){
  	System.out.println("init RestController");
  }
  
  //this method responses to GET request http://localhost/spring-mvc-json/rest/cont
  // return Person object as json
  
  @RequestMapping(method = RequestMethod.GET)
  public @ResponseBody Person get(HttpServletResponse res) {
  	
  	Person person = new Person();
  	person.setId(1);
  	person.setName("hmk");
  	
      return person;
  }
  
  //this method response to POST request http://localhost/spring-mvc-json/rest/cont/person
  // receives json data sent by client --> map it to Person object
  // return Person object as json
  @RequestMapping(value="person", method = RequestMethod.POST)
  public @ResponseBody Person post( @RequestBody final  Person person) {	
  	
      System.out.println(person.getId() + " " + person.getName());
      return person;
  }
}


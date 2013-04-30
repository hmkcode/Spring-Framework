package com.hmkcode.spring.mybatis;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmkcode.spring.mybatis.service.Service;
import com.hmkcode.spring.mybatis.vo.Person;


public class App 
{
  private static Log log = LogFactory.getLog(App.class);

    public static void main( String[] args )
    {

      ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
      Service service = (Service) cxt.getBean("service");
  	
      log.info("Running App...");

      
      System.out.println("List<Person> persons = service.selectAllPerson()");
      List<Person> persons = service.selectAllPerson();
      System.out.println(persons);
      
      System.out.println("Person person = service.selectPerson(2)");
      Person person = service.selectPerson(2);
      System.out.println(person);

      
      System.out.println("service.insertPerson(person)");
      person.setId(persons.size()+1);
      service.insertPerson(person);
      System.out.println(person);
      
      
      System.out.println("List<Person> persons = service.selectAllPerson2()");
      persons = service.selectAllPerson2();
      System.out.println(persons);
      
      
    }
}

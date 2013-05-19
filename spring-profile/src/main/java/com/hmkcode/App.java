package com.hmkcode;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.hmkcode.vo.Person;

public class App 
{
    public static void main( String[] args )
    {
    	
    	System.setProperty("spring.profiles.active", "development"); //or production
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-all.xml");
    	
        Person person =  (Person)ctx.getBean("person");
        System.out.println("Person: "+person);
    }
}

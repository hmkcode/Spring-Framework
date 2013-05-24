package com.hmkcode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.hmkcode.vo.Person;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("development"); //or production
        ctx.scan("com.hmkcode.spring"); // register all @Configuration classes
        //ctx.register(SpringConfigDev.class);
        ctx.refresh();
        Person person = (Person)ctx.getBean("person");

    
        System.out.println("Person: "+person);
    }
}

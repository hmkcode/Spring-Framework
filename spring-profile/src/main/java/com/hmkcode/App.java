package com.hmkcode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.hmkcode.spring.SpringConfig;
import com.hmkcode.vo.Person;


public class App 
{
    public static void main( String[] args )
    {
        
    	// ( 1 ) System.setProperty("spring.profiles.active", "development");
    	//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-all.xml");
    	
    	// ( 2 )
    	/*ConfigurableEnvironment env = ctx.getEnvironment();
    	env.setActiveProfiles("development");
    	ctx.refresh(); */
    	
    	//( 3 ) 
    	/*GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    	ConfigurableEnvironment env = ctx.getEnvironment();
    	env.setActiveProfiles("production");
    	ctx.load("spring-config-development.xml","spring-config-production.xml");
    	ctx.refresh();*/
    	
    	//( 4 ) combine 
    	
    	
    	//( 5 ) 
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("development");
        ctx.register(SpringConfig.class); 
        ctx.refresh(); 
        Person person =  (Person)ctx.getBean("person");

    	
        System.out.println("Person: "+person);
    }
}

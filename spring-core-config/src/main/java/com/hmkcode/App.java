package com.hmkcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmkcode.spring.beans.AnotherBean;
import com.hmkcode.spring.beans.MyBean;
import com.hmkcode.spring.config.JavaConfig;


public class App 
{
    public static void main( String[] args )
    {
    	
        
    	ApplicationContext ctxXML = new ClassPathXmlApplicationContext("config/XMLConfig.xml");
        AnotherBean anotherBean = (AnotherBean) ctxXML.getBean("anotherBean");
         
        System.out.println( anotherBean);
        
        //---------------------------------------
        
        
        ApplicationContext ctxAnnotation = new ClassPathXmlApplicationContext("config/XMLConfig-Annotation.xml");
        anotherBean  = (AnotherBean) ctxAnnotation.getBean("anotherBean");
             
        System.out.println( anotherBean);
        
        //---------------------------------------

        
        ApplicationContext ctxJavaConfig = new AnnotationConfigApplicationContext(JavaConfig.class);
        anotherBean = (AnotherBean) ctxJavaConfig.getBean("anotherBean2");
 
        System.out.println( anotherBean);

    }
}

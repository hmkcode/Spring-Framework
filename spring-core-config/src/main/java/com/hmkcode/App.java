package com.hmkcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmkcode.spring.beans.MyBean;
import com.hmkcode.spring.beans.MyBeanAnnotated;
import com.hmkcode.spring.config.JavaConfig;


public class App 
{
    public static void main( String[] args )
    {
    	
        
        ApplicationContext ctxXML = new ClassPathXmlApplicationContext("config/XMLConfig.xml");
        MyBean myBean = (MyBean) ctxXML.getBean("myBean");
    	
        System.out.println( myBean);
        
        ApplicationContext ctxAnnotation = new ClassPathXmlApplicationContext("config/XMLConfig-Annotation.xml");
        myBean = (MyBean) ctxAnnotation.getBean("myBean2");
    	
        System.out.println( myBean);
        
        ApplicationContext ctxJavaConfig = new AnnotationConfigApplicationContext(JavaConfig.class);
        myBean = (MyBean) ctxJavaConfig.getBean("myBean3");

        System.out.println( myBean);

    }
}

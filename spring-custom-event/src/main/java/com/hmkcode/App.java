package com.hmkcode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmkcode.beans.Login;


public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	Login login = (Login) ctx.getBean("login");
    	login.login();
    }
}

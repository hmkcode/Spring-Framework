package com.hmkcode.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmkcode.spring.beans.RootBean;



@Controller
@RequestMapping("/controller")
public class MyController {

	public MyController(){
		System.out.println("new Controller");
	}
	
	@Autowired
	ApplicationContext context;
	
	 @RequestMapping(value = "/get", method = RequestMethod.GET)
	 public @ResponseBody String get() {              
		 
		 RootBean rootBean = (RootBean) context.getBean("rootBean");
		 System.out.println(rootBean);		 
		
		return rootBean.toString();		
	}
			
}


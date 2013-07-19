package com.hmkcode.controllers;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller")
public class RestController {

	public RestController(){
		System.out.println("init RestController");
	}
	
	// URL: /rest/controller/any
	 @RequestMapping(value="/any", method = RequestMethod.GET)
	 public String any(ModelMap model) {

			model.addAttribute("message", "This URL can be accessed by any one");
			return "hello";
	 
	}

	 // URL: /rest/controller/user
	@RequestMapping(value="/user", method = RequestMethod.GET)
	 public String user(ModelMap model) {
		String user = SecurityContextHolder.getContext().getAuthentication().getName();
			
		model.addAttribute("message", "This URL can be accessed only by authorized user "+user);
			
		return "hello"; 
	}
			
}


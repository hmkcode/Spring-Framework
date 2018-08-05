package com.hmkcode.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmkcode.model.Link;

@RestController
@RequestMapping("api")
public class Controller {
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public @ResponseBody Link get(){
		System.out.println("Get!");
		
		Link link = new Link();
		link.setTitle("HMKCODE BLOG!");
		link.setUrl("hmkcode.com");
		
		return link;
		
	}

}

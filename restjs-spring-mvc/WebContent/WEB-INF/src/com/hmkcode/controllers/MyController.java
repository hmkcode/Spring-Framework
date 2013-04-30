package com.hmkcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmkcode.vo.Person;

@Controller
public class MyController {
	
	@RequestMapping("/view")
	public @ResponseBody Person getPerson(){
		Person person = new Person();
		person.setId(1);
		person.setName("hmk");
		return person;
	}

}

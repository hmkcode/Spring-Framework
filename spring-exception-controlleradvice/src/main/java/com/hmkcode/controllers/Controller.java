package com.hmkcode.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	
	 @RequestMapping("/ok")	 
	 public @ResponseBody String ok() throws Exception {
	  	return "OK";
	 }
	 
	 @RequestMapping("/exception")	 
	 public @ResponseBody String exception() throws Exception {
	  	throw new Exception("Error");
	 }
}

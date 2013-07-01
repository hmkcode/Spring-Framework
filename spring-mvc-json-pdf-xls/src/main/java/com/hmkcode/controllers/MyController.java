package com.hmkcode.controllers;



import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hmkcode.data.Data;
import com.hmkcode.vo.Article;




@Controller
@RequestMapping("/controller")
public class MyController {

	public MyController(){
		System.out.println("init RestController");
	}
	
	 @RequestMapping(value = "/get", method = RequestMethod.GET)
	 public @ResponseBody List<Article> get(HttpServletRequest request, HttpServletResponse response) {                 
		 
		 
		return Data.getData();
		 
		
	}
			
}


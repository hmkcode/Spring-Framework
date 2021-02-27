package com.hmkcode.exception;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class ControllerAdvisor {

	
	@ExceptionHandler(Exception.class)	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	
	public @ResponseBody String generalException(final Exception exception,
			final HttpServletRequest request) {

		return exception.getMessage()+" while calling: "+request.getRequestURI();

	} 
}


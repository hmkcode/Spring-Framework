package com.hmkcode.spring.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="b")
public class MyBeanAnnotated {

	private String name;

	public String getName() {
		return name;
	}

	@Required
	@Value(value="annotationBean")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}
	
}

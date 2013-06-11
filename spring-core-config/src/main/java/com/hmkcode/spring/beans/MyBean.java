package com.hmkcode.spring.beans;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myBean2")
public class MyBean {

	private String name;

	public String getName() {
		return name;
	}

	@Value(value="BeanName")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}
	
}

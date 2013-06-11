package com.hmkcode.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hmkcode.spring.beans.MyBean;

@Configuration
public class JavaConfig {

	@Bean(name = "myBean3")
	public MyBean myBean(){
		MyBean myBean = new MyBean();
		myBean.setName("myBeanJavaConfig");
		return myBean;
	}
}

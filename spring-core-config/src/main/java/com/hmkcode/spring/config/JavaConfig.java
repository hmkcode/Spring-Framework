package com.hmkcode.spring.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hmkcode.spring.beans.AnotherBean;
import com.hmkcode.spring.beans.MyBean;
 
@Configuration
public class JavaConfig {
 
    @Bean
    public MyBean myBean(){
        return  new MyBean();
    }
     
    @Bean(name = "anotherBean2")
    public AnotherBean anotherBean(){
        return new AnotherBean();
    }
}
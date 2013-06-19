package com.hmkcode.spring.beans;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component(value="myBean")
public class MyBean {
 
    private String name;
 
    public String getName() {
        return name;
    }
 
    @Value(value="AnnotationBean")
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "MyBean [name=" + name + "]";
    }
     
}
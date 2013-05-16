package com.hmkcode.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hmkcode.spring.mybatis.mapper.Mapper;
import com.hmkcode.spring.mybatis.vo.Child;
import com.hmkcode.spring.mybatis.vo.Parent;


public class Service {
	
	@Autowired 
	private Mapper mapper;

	public List<Parent> selectAllParent(){
		return mapper.selectAllParent();
	}
	
	public Parent selectParent(int id){
		return mapper.selectParent(id);
	}
	
	public int insertParent(Parent parent){
		return mapper.insertParent(parent);
	}

	public List<Child> selectAllChildren(int parnetId){
		return mapper.selectAllChildren(parnetId);
	}
	
	public Child selectChild(int id){
		return mapper.selectChild(id);
	}
	
	public int insertchild(Child child){
		return mapper.insertchild(child);
	}
}

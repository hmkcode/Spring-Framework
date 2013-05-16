package com.hmkcode.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hmkcode.spring.mybatis.vo.Child;
import com.hmkcode.spring.mybatis.vo.Parent;;


public interface Mapper {

	//if @Select is used table/column name and class/property name should be the same

	
	//SQL query in "Mapper.xml"
	public List<Parent> selectAllParent();
	
	//SQL query in "Mapper.xml"
	public Parent selectParent(@Param("id") int id);
	
	@Insert("INSERT INTO parent (parentName) VALUES (#{parentName})")
	public int insertParent(Parent parent);

	@Select("SELECT * FROM child WHERE parentId = #{id}")
	public List<Child> selectAllChildren(@Param("id") int id);
	
	@Select("SELECT * FROM child WHERE childId = #{id}")
	public Child selectChild(@Param("id") int id);
	
	//SQL query in "Mapper.xml"
	public int insertchild(Child child);
		
}


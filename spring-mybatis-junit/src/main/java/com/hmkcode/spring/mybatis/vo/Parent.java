package com.hmkcode.spring.mybatis.vo;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Parent")
public class Parent {

	private int parentId;
	private String parentName;
	
	private List<Child> children;
	

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}
	
	public String toString(){
		return "\nParent [ id: "+this.parentId+" - name: "+this.parentName+" \n" +
						"\tchildren: "+this.children+
				"\n]"; 
	}
}

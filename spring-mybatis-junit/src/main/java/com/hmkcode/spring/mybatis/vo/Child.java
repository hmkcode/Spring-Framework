package com.hmkcode.spring.mybatis.vo;

import org.apache.ibatis.type.Alias;

/**
 * Hello world!
 *
 */
@Alias("Child")
public class Child extends Parent
{
	private int childId;
   	private String childName;
	
   	
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String toString(){
		return "Child [ id: "+this.childId+" - name: "+this.childName+" (PARENT_ID :"+this.getParentId()+") ]"; 
	}
}

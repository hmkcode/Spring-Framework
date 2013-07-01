package com.hmkcode.vo;

import java.util.LinkedList;
import java.util.List;

public class Article {

	private String title;
	private String ulr;
	private List<String> categories;
	private List<String> tags;
	
	public void addCategory(String category){
		if(categories == null)
			categories = new LinkedList<String>();
		
		categories.add(category);
	}
	public void addTag(String tag){
		if(tags == null)
			tags = new LinkedList<String>();
		
		tags.add(tag);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUlr() {
		return ulr;
	}
	public void setUlr(String ulr) {
		this.ulr = ulr;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	
}

package com.hmkcode.data;

import java.util.LinkedList;
import java.util.List;

import com.hmkcode.vo.Article;

public class Data {

	public static List<Article> getData(){
		
		List data = new LinkedList<Article>();
		
		Article article = new Article();
		
		article.setTitle("Spring MVC + jQuery File Upload (multiple, drag&drop, progress…)");
		article.setUlr("http://hmkcode.com/spring-mvc-jquery-file-upload-multiple-dragdrop-progress/");
		article.addCategory("Spring MVC");
		article.addTag("Spring MVC");
		article.addTag("jQuery");
		
		data.add(article);
		return data;

	}
}

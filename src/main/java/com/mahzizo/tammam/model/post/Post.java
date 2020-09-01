package com.mahzizo.tammam.model.post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Annotation used to indicate that 
// the properties that do not match the json response should be ignored
@JsonIgnoreProperties
public class Post {
	
	private int userId;
	private int id;
	private String title;
	private String body;
	
	public Post() {}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
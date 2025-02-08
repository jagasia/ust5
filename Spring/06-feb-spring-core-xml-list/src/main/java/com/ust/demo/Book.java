package com.ust.demo;

import java.util.List;

public class Book {
	private String title;
	private List<String> authors;
	
	public Book() {}

	public Book(String title, List<String> authors) {
		super();
		this.title = title;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
}

package com.web.model;

import javax.validation.constraints.NotNull;

public class Book {

	private Integer bookId;
	
    @NotNull(message="is required")
	private String bookName;
	
	
	@NotNull(message="is required")
	private String authorName;
	
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
}

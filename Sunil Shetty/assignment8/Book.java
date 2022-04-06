package com.example.demo.booksentity;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


@Entity
@Table(name="book")
public class Book {
	@Id
	private Integer id;
	private String bookName;
	private String bookAuthor;
	public Book() {
		
		// TODO Auto-generated constructor stub
	}
	public Book(Integer id, String bookName, String bookAuthor) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
}
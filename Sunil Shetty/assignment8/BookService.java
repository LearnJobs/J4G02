package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.booksentity.Book;
@Service
public interface BookService {

	
	public List<Book> getAllBooks();
	
	public Book addBook(Book book);
	
	//public Book updateBook(Book book);
	
	public void deleteBook(Integer id);

	public Book updateBook(Book book);
}

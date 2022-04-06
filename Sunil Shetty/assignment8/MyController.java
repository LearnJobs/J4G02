package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookService;

@RestController
public class MyController<Book> {
	@Autowired
	private BookService bookservice;

	@GetMapping(value = "/books")
	public <Book> List<Book> getAllBooks() {
		return this.getAllBooks();

	}

	@PostMapping(value = "/book/add")
	public Book addBook(@RequestBody Book book) {
		bookservice.addBook((com.example.demo.booksentity.Book) book);
		return addBook(book);
	}

	public String deleteBook() {
		return null;
	}

}

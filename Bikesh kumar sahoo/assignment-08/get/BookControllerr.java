package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControllerr {

	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/books/{bookid}")
	public Optional<Book>getBook(@PathVariable("bookid") int bookid) throws BookNotFoundException{
		Optional<Book> b=bookRepository.findById(bookid);
		if(!b.isPresent()) {
			throw new BookNotFoundException("book Id :"+bookid +",is not avilable");
		}
		return b;
	}

}

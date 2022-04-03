package com.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Book.Repository.Bookrepository;
import com.Book.model.Book;

@RestController
public class BookController {

	@Autowired
	Bookrepository<?> bookrepository;

	@PostMapping("/books")
	public String insertBook(@RequestBody Book book) {
		bookrepository.save(book);
		return "record is succesfull sid";
	}

	@PostMapping("/multiplebooksave")
	public String insertBook(@RequestBody List<Book> book) {
		bookrepository.saveAll(book);
		return "All record is succesfull added sid";
	}

	@GetMapping("/getBybookId/{bookId}")
	public List<Book> getbook(@PathVariable("bookId") Integer id) {
		bookrepository.findAll();
		return (List<Book>) bookrepository.findAll();

	}

	@GetMapping("/books")
	public List<Book> getbook() {
		bookrepository.findAll();
		return (List<Book>) bookrepository.findAll();

	}

	@GetMapping("/getBybookName/{name}")
	public List<Book> getbook(@PathVariable("name") String bookname) {
		bookrepository.findAll();
		return (List<Book>) bookrepository.findBybookname(bookname);

	}

}

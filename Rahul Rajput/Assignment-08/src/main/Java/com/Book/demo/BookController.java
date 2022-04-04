package com.book.Demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();

	}

	@GetMapping("/getBook/{bookid}")
	public Optional<Book> getBook(@PathVariable("bookid") int bookid) throws BooksNotFoundException {

		Optional<Book> b = bookRepository.findById(bookid);
		if (!b.isPresent()) {
			throw new BooksNotFoundException("Book Id :" + bookid + ",is not available!!");
		}

		return b;
	}

	@DeleteMapping("/book/{bookid}")
	public void deleteBook(@PathVariable("bookid") int bookid) {
		bookRepository.deleteById(bookid);

	}

	@PostMapping("/books")
	public int updateBook(@RequestBody Book books) {
		bookRepository.save(books);
		return 1;
	}

}

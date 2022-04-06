package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.booksentity.Book;
import com.example.demo.dao.BookDao;

public class BookServiceImpl implements BookService {
	@Autowired
private BookDao bookdao;

	@Override
	public List<Book> getAllBooks() {
		return bookdao.findAll();

	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		bookdao.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub

		bookdao.save(book);
		return book;
	}

	@Override
	public void deleteBook(Integer parseint) {
		// TODO Auto-generated method stub
		 Book entity=bookdao.getOne(parseint);
		 bookdao.delete(entity);
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
		
		
	}
}

package com.example.demo.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Book.model.Book;

public interface BookRepository {

@Repository
public interface Bookrepository<Topic> extends JpaRepository<Book, Integer> {

	List<Book> findBybookname(String bookname);

}

public void save(com.example.demo.BookModel.Book book);

public List<com.example.demo.BookModel.Book> findBybookname(String bookname);

 }
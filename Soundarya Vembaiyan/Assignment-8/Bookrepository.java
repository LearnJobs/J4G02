package com.Book.Rep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Book.bk.Book;


@Repository
public interface Bookrepository<Topic> extends JpaRepository<Book, Integer> 
{

	List<Book> findBybookname(String bookname);

}
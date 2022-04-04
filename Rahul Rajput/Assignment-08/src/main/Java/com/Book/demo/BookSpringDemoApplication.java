package com.book.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookSpringDemoApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookSpringDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book book1 = new Book(101, "Jungle Book", "Rahul");
		bookRepository.save(book1);
		Book book2 = new Book(102, "Java", "Aditya");
		bookRepository.save(book2);
		Book book3 = new Book(103, "2-State", "Kumar");
		bookRepository.save(book3);
		Book book4 = new Book(104, "Harry Potter", "Nitin");
		bookRepository.save(book4);
		Book book5 = new Book(105, "Doremon", "Ritik");
		bookRepository.save(book5);

		System.out.println("Execute Successfully!!");

	}
}

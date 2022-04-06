package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBootDemo2Application implements CommandLineRunner{
	
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo2Application.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception{
//		System.out.println("Table Created!!!");
//		for(int i= 1;i<=5;i++) {
//			int counter=10+i;
//			Book book1=new Book(counter,"java  -"+i,"james gosling ");
//			bookRepository.save(book1);
//		}
		Book book1 = new Book(10, "JavaScript", "mandar sir");
		bookRepository.save(book1);
		Book book2 = new Book(11, "Angular", "mandar sir");
		bookRepository.save(book2);
		Book book3 = new Book(12, "python", "Narayan Sir");
		bookRepository.save(book3);
		Book book4 = new Book(13, "java", "milan sir");
		bookRepository.save(book4);
		Book book5 = new Book(14, "spring", "mandar sir");
		bookRepository.save(book5);

		System.out.println("Saved Successfully");
		
		
//		List<Book> bookList=bookRepository.findAll();
//		for(Book book:bookList)
//			System.out.println(book);
//		
//		Optional<Book> b = bookRepository.findById(12);
//		if(b.isPresent())
//			System.out.println(b);
//		else
//     		System.out.println("book not found");
		
		
//		System.out.println("Select book is :");
//		Optional<Book> b = bookRepository.findById(12);
//		if(b.isPresent())
//			System.out.println(b);
//		else
//			System.out.println("book not found");
//

	}

}

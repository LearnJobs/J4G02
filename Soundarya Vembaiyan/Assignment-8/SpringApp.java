package com.Sap.s;

import java.awt.print.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Book.Rep.Bookrepository;

@SpringBootApplication
public class SpringJpaApplication 
{
     
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Autowired
	Bookrepository Rep;	
     
	public void run(String[] args) throws Exception 
	{
		System.out.println("Table created !!");

	}


}
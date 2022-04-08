package Assignment4_3.java;
import java.util.*;

public class BookesDetails {
	public static void  main(String...strings) {
		ArrayList<Book>c=new ArrayList<Book>();
		 c.add(new Book(2018, "java","James Gosling",44665 ));
		  c.add(new Book(2018, "Post Office","Rabindranath Tagore",965 ));
		  c.add(new Book(20118, "Vish Vrisha","Bankim Chandra Chatterjee",9665 ));
		  c.add(new Book(2015, "War of Indian Indipendence","Vir Savakar",4665 ));
		  c.add(new Book(20184, "We , Indians","Khushwant Singh",665 ));
		  c.add(new Book(20183, "Tarkash","Javed Akhtar",9665 ));
		  c.add(new Book(20180, "The congress and The making of Indian Nation","Pranab Mukerjee",6065 ));
		  c.add(new Book(20189, "Prison Diary","Jayaprakash Narayan",1665 )); // Call the sort function
	   //   Collections.sort(c)
		



	      for(Book book :c) {
	    	  System.out.println(book.id+""+book.name+" "+book.Author_name+" "+book.price);
	      }
	        
	       
		


		
	}}
class Book{
	int id;
	String name;
	String Author_name;
	float price;
	Book(int id , String name ,String Author_name,float price){
		this.id=id;
		this.name=name;
		this.Author_name=Author_name;
		this.price=price;
	}
}



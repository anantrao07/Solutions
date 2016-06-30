package com.example.anant;

public abstract class Book {
	
	String title;
    String author;
    
	
	
	 Book(String s, String a) {
		this.title = s;
		this.author = a;
		
		
	}

	abstract  void  display();
	
	
}

package com.example.anant;

public class MyBook extends Book {

	 String  title ;
	 String  author;
	 int price;

	 MyBook(String s, String a , int p ){
		 super(s,a);
		 this.title =s ;
		 this.author = a;
		 this.price = p;
		 
	 }
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title:"+this.title); 
		System.out.println("Author:"+this.author); 
		System.out.println("Price:"+price);
		
	}
	
	
		
	}

	

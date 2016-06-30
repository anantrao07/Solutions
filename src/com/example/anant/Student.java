package com.example.anant;

import java.util.Vector;

public class Student extends Person  {

	private String firstName;
	private String lastName;
	private int id;
	int[] testScores ;
	int sum;
	
	
	
	// Constructor
	Student(String firstName, String lastName, int id ,int[] marks){
		super(firstName,  lastName,  id);
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.id = id;
		this.testScores = marks;
		
	}
	
	
	   
	
		public char calculate(){
			// sum= 0 ;
			int avg = 0;
			int l = testScores.length;
		for(int i= 0 ; i<testScores.length ; i++){
			 
			sum = sum+testScores[i];
			
			
		}
		System.out.println("sum is "+sum);
		avg = sum/l;
		System.out.println("avg is "+avg);
		if(avg>=90 && avg<=100){
			return 'O';
		}
		else if(avg>=80 && avg<90){
			return 'E';
		}
		else if(avg>=70 && avg<80){
			return 'A';
		}
		else if(avg>=55 && avg<70){
			return 'P';
		}
		else if(avg>=40 && avg<55){
			return 'D';
		}

		else if(avg<40){
			return 'T';
		}
			return (Character) null;
			
		}

}

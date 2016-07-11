package com.example.anat.library;

import java.util.Scanner;

public class Library {

	static final int dayfine = 15;
	static final int monthfine = 500;
	static final int yearfine = 10000;
	


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int totalFine = 0;
	        
	       
	        int d = sc.nextInt();
	        int m = sc.nextInt();
	        int y = sc.nextInt();
	     
	        int ed = sc.nextInt();
	        int em = sc.nextInt();
	        int ey = sc.nextInt();
	        
	        if(y<=ey && m == em){
	        	
	        	if(d > ed){
	        		totalFine = dayfine*(d-ed);
	        		System.out.println(totalFine);
	        		
	        	}
	        	else {
	        		
	        		System.out.println(totalFine);
	        		
	        	}
	        
	        }
	        
	        if(y>ey){
	        	System.out.println(yearfine);
	        	
	        }
	        if(y<ey){
	        	System.out.println("0");
	        	
	        }
	        if(y==ey && m!=em){
	        	if(em>m){
		        	totalFine = monthfine*(em-m);
		        	System.out.println(totalFine);
		        	}
		        	else{
		        		totalFine = monthfine*(m-em);
		        		System.out.println(totalFine);
		        		
		        	}
	        	
	        }
	       
	    }
	}


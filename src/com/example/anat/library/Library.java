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
	        
	       
	        int rd = sc.nextInt();
	        int rm = sc.nextInt();
	        int ry = sc.nextInt();
	     
	        int ed = sc.nextInt();
	        int em = sc.nextInt();
	        int ey = sc.nextInt();
	        
	        if(ry==ey && rm == em){
	        	
	        	if(rd > ed){
	        		totalFine = dayfine*(rd-ed);
	        		System.out.println(totalFine);
	        		
	        	}
	        	else {
	        		
	        		System.out.println(totalFine);
	        		
	        	}
	        
	        }
	        
	        if(ry>ey ){
	        	System.out.println(yearfine);
	        	
	        }
	        
	        if(ry<ey){
	        	System.out.println("0");
	        	
	        }
	        if(ry==ey && rm>em){
	        	
		        		totalFine = monthfine*(rm-em);
		        		System.out.println(totalFine);
		    	
	        }
	        else if(ry==ey && rm<=em && rd <=ed){
	          	System.out.println("0");
	        }
	    }
	}


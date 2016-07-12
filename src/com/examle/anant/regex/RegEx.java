package com.examle.anant.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Class to take input from user(name ,email id) return only the customers with email id on gmail.com in 
	//alphabetical order
public class RegEx {


	   public static void main(String[] args) {
		   HashMap<String, String> customerDetails = new HashMap<String, String>();
		   ArrayList<String> names = new ArrayList<String>();
		  
		   
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	  
	        for(int a0 = 0; a0 < N; a0++){
	            String firstName = in.next();
	            String emailID = in.next();
	            customerDetails.put(emailID, firstName);
	            
	        }
	        in.close();
	        //String myregexString = "[a-z]+"+"\\p{Punct}+"+"gmail.com";
	        String myregexString = ".+\\@gmail.com";
	    
	        for(String element:customerDetails.keySet()){
	        
	  
	        	 if(element.matches(myregexString) ){
	        		
	        		names.add(customerDetails.get(element)) ;
	        	 }
	         
	        }
	        java.util.Collections.sort(names);
	        
	        for(String s : names){
	        	System.out.println(s);
	        }
	     
	        	
	        }
	        
	   
	    }



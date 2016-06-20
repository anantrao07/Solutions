package com.example.anant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//Class to convert base 10 number to base 2 (binary) and then print the maximum number of consecutive ones appearing in binary reprsentation 
//The binary representation of 5  is 101 , so the maximum number of consecutive 's is  1 .
//The binary representation of  13 is  1101 , so the maximum number of consecutive 's is 2 .

public class Binary {

	public static ArrayList<Integer>  binary(int number ){
		ArrayList<Integer>remainder = new ArrayList<Integer>();
		
		 while(number>0){
	        	remainder.add(number%2);
	        	number = number/2;
	        	
	        }
		 
	     int length = remainder.size();
	        
	        for(int i = length-1; i>=0;i--){
	        	System.out.print(remainder.get(i));	
	        }
	        System.out.println(" ");
	        return remainder;
	}
	
	public static void main(String[] args) {
		
		//int count = 0;
		int n;
		ArrayList<Integer> binaryList = new ArrayList<Integer>();
		
		   Scanner in = new Scanner(System.in);
	       n  = in.nextInt();
	       
	     
	        binaryList=  Binary.binary(n);
	        ArrayList<Integer> count = new ArrayList<Integer>();
	        int counter = 0;
	        int max =0;
	    for(int i = 0 ; i<binaryList.size() ; i++){
	    	int temp = binaryList.get(i);
	    	
	    	if(temp == 1 ){
	    		counter = counter+1;
	    		
	    		
	    	}
	    	
	    	else{
	    		counter = 0;
	    		
	    	}
	    	count.add(counter);
	
	    }
	    
	    max = Collections.max(count);
	    
	    System.out.println(max);
       
	   in.close();
	}
	

}

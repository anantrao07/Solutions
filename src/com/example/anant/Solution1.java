package com.example.anant;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

 

    public static void main(String[] args) {
          
    Scanner sc = new Scanner(System.in);
    
        int testCase = sc.nextInt();
        String sArray[] = new String[testCase];
        
     for(int i =0 ; i<testCase ; i++){
    
        sArray[i] = sc.next();
     
       }
     sc.close();
         
        for(int i = 0; i<testCase; i++){
        	StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
     Character[] sample = Solution.toCharacterArray(sArray[i]);
        for(int j = 0;j<sample.length ; j++){
        	
        	
            if(j%2 == 0){
             
            
                even.append(sample[j]);
                
            }
            else if(j%2 != 0){
             
                odd.append(sample[j]);
            }
            else if((sample[j]==' ')){
                continue;
                
            }
            
            
           }
        System.out.print(even + " "+odd+" \n");

    }
       	
        }
    
    //custom method to convert string array to character array 
    public static Character[] toCharacterArray(String s){
    	
    	Character[] charArray;
    	if(s.equals(null)){
    		return null;
    	}
    	int length = s.length();
    	charArray = new Character[length];
    	for(int i = 0 ; i<length ; i++){
    		charArray[i] = s.charAt(i);		
    	}
    	return charArray;	   	
    }
}
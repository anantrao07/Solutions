package com.example.abstrct.anant;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//The absolute difference between two integers, a and b , is written as . 
//The maximum absolute difference between two integers in a set of positive integers a and b 
//is the largest absolute difference between any two integers in array  .
class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	
  	Difference(int[] arrays){
  		
  		this.elements = arrays;
  		
  	}
  	
  	void computeDifference(){
  		int l = elements.length;
  		ArrayList<Integer> tempdiff = new ArrayList<Integer>();
  		
  		for(int i= 0 ; i<l ; i++){
  			for(int j = 0 ; j<l ;j++){
  			int temp = elements[i];
  			int diff = elements[i]-elements[j];
  	
  			tempdiff.add(Math.abs(diff));
  	
  			
  		}
  			
  		}
  		
  	
  		
  		int i = Collections.max(tempdiff);
  		maximumDifference = i;
  		
  		
  	}
}



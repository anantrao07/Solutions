package com.example.anant.bitwiseand;

import java.util.Scanner;

public class BitwiseAnd {
	
	public static int bitwiseAnd(int set , int k){
		int s[] = new int[set];
		int temp = 0;
		
		
		
		for(int i = 0 ; i<set ; i++){
	
			s[i] = i+1;
			
		}
		
	/*	for(int i = 0 ; i<k ; i++){
			if(s[i]<k){
				temp = s[i];
				
			}
			
		}*/
		
		for(int i = 0 ; i<s.length ; i++){
			for(int j = 1 ;j<s.length-1;j++){
				if(s[i]<s[j] & s[i]<k){
					temp = s[i];
					
				}
			}
		}
			/*for(int j = set-1 ; j>=0 ;j-- ){
				for(int i = 0 ; i<set ; i++){
				if(s[i]<s[j] & s[i]<k){
					temp = s[i];
					
				}
				
			}*/
		
		return temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        int values[] = new int[t];
	        
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int k = in.nextInt();
	           values[a0] =  bitwiseAnd(n, k);
	            
	        }
	        in.close();
	        
	        
	        for(int a0 = 0; a0 < t; a0++){
	           
	           System.out.println(values[a0]);
	           
	            
	        }
	        
	
	}

}

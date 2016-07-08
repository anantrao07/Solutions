package com.example.anant.timecomplexity;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	
	public void prime(int n ){
		boolean isprime = false;
		if(n ==1 ){
			System.out.println("Not prime");
			
		}
		else if(n==2){
			System.out.println("Prime");
		}
		
	
		int sqrt = (int) Math.sqrt(n);
		for(int i =2 ; i<=sqrt ; i++){
			//System.out.println("count: "+ count);
			if(n%i==0){
				//count = count+1;
				
				System.out.println("Not prime");
				isprime = false;
				
				break;
			}
			else{
				isprime = true;
				
			}
	
		}
		if(isprime){
			System.out.println("Prime");
		}
		
		
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution sln = new Solution();
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
	
		for(int i = 0 ; i<n;i++){
			a[i] = s.nextInt();

		}
		s.close();
		Solution sln = new Solution();
		for(int i = 0 ; i<a.length;i++){
			//Solution sln = new Solution();
			sln.prime(a[i]);

		}

	}

}

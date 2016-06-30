package com.example.anant;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Calculate the hourglass sum for every hourglass in the matrix of 6X6  , then print the maximum hourglass sum.
public class HourGlass {

    public static void main(String[] args) {
    	ArrayList<Integer> sumList = new ArrayList<Integer>();
    	int[] sum = new int[16];
    	int h = 0 ; 
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
            
           
        }
        
        for(int i = 0 ; i<4;i++){
        for(int j = 0 ; j<4;j++){
        sum[h] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        	h++;
        	continue;
        	
        	
        }	
        }
        
        for(int i = 0 ; i<16 ; i++){
        	System.out.println(sum[i]);
        }
        Arrays.sort(sum);  
System.out.println(sum[15]);
}
}

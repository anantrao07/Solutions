package com.example.anant;
import java.util.*;
import java.io.*;

class Maps{
	
	
	
    public static void main(String []argh){
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            
            int phone = in.nextInt();
           
            phoneBook.put(name, phone);
         //   System.out.println(phoneBook.get(name));
            
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)){
            	System.out.println(s+"="+phoneBook.get(s));
            }
            else{
            	System.out.println("Not found");
            }
            
            // Write code here
        }
        in.close();
    }
}

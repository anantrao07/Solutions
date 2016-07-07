package com.example.anant.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

	Stack stack = new Stack<String>();
	Queue queue = new LinkedList<String>();
	boolean isPalindrome ;
	
	public void  ispalindrome(String word){
		
		for(int i = 0 ; i<word.length();i++){
			stack.push(word.charAt(i));
			queue.add(word.charAt(i));
			
		
		}
		for(int i = 0 ; i<word.length();i++){
			
			if(stack.pop()==queue.remove()){
			 isPalindrome = true;
			
			 
			}
			else{
				isPalindrome = false;
				
				break;
				
			}
			
		}
		if(isPalindrome== true){
			System.out.println("word is palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome p = new Palindrome();
		 p.ispalindrome("racecar");
	
		
	}

}

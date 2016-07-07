package com.example.anant.queue;

import java.util.LinkedList;

public class Queuey {

	LinkedList queue;
	
	public Queuey(){
		queue = new LinkedList<String>();
		
	}
	
	//is empty method
	public boolean isEmpty(){
		return queue.isEmpty();
		
	}
	
	//size method
	public int size(){
		return queue.size();
		
	}
	
	//add method 
	public void enqueue(String n ){
		
		queue.addLast(n);
		
	}
	
	//dequeue method 
	public String dequeue(){
		return (String)queue.remove(0);
		
	}
	
	//peek at the first item 
	public String peek(){
		return (String)queue.get(0);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queuey stringQueue = new Queuey();
		stringQueue.enqueue(" Hi folkes");
		stringQueue.enqueue(" folkes says hi back");
		
		System.out.println("Dequeueing the queue"+ stringQueue.dequeue());
		System.out.println("Dequeueing the second number queue"+ stringQueue.dequeue());
	}

}

package com.example.anant.trycatch;

public class Power {
	
	    
		   
	    public int power(int n , int p) throws Exception {
	        
	        int number = n;
	        if(n <0 || p< 0){
	            throw new Exception("n and p should be non-negative");
	            
	        }
	        else if(p==0){
	            
	            	number =1;
	                //System.out.println(number);
	            	return number;
	            	
	            }
	            else{
	            	
	            
	            int i = p;
	            while(i>1){
	              number = number *n;
	                i--;
	            }
	           
	            System.out.println(number);
	            return number;
	            
	            }
	            
	            
	        }
	    
	    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Power c = new Power();
		c.power(3,0);
		
	}

}

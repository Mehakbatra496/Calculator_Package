package com.example;

import com.example.myPackage.*;
public class Calculator {
	 	
		int value;
	    
		private void add() {
	        System.out.println("I can add......");
	    }
	    
	    void multiply() {
	        System.out.println("I can multiply......");
	    }
	    
	    
	    public static void main(String[] args)
	    {
	    	Calculator c= new Calculator();
	    	c.add();
	    	c.multiply();
	    	
	    	
	    	NewCalculator n= new NewCalculator();
	    	double d2=n.newTemperature();
	    	System.out.print(d2);
	    	
	    	SubCalculator obj = new SubCalculator();
	    	double d=  obj.temperature(); 
	        System.out.println("The temperature is "+ d); 
	        
	        
	        
	        
	        
	        
	        
		       System.out.print(Status.CANCELLED);
	    }
		
	    
}

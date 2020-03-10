package com.capgemini.quiz.day8;
/*Output*/
public class McqSeven {
	 private int data; 
	  
	    public McqSeven() 
	    { 
	        data = 5; 
	    } 
	  
	    public int getData() 
	    { 
	        return this.data; 
	    } 
	} 
	  
	class Derived extends McqSeven 
	{ 
	    private int data; 
	    public Derived() 
	    { 
	        data = 6; 
	    } 
	    private int getData() 
	    { 
	        return data; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Derived myData = new Derived(); 
	        System.out.println(myData.getData()); 
	    } 
}
/*	a) 6
 *  b) 5
 *  c) Compile time error
 *  d) Run time error
 *  
 *  
 *  ANS:C
 *  */
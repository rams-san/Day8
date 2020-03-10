package com.capgemini.quiz.day8;
/*Output*/
public class McqFive {
	public static void main(String[] args) 
    { 
        int value = 3, sum = 6 + -- value; 
          
        int data = --value + ++value / sum++ * value++ + ++sum  % value--; 
        System.out.println(data); 
    } 
}

/* a) 1
 * b) 2
 * c) 0
 * d) 3
 * 
 * ANS:b
 * 
 * */
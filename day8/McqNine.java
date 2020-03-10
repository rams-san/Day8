package com.capgemini.quiz.day8;
/*Output*/
import java.io.*;
import java.util.*;

public class McqNine {
	 public static void main(String[] args) 
	    { 
	        try
	        { 
	            System.out.printf("%d", 1); 
	            throw(new Exception()); 
	        } 
	        catch(IOException e) 
	        { 
	            System.out.printf("%d", 2); 
	        } 
	        catch(EmptyStackException e) 
	        { 
	            System.out.printf("%d", 3); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.printf("%d", 4); 
	        } 
	        finally
	        { 
	            System.out.printf("%d", 5); 
	        } 
	    } 
}
/*a) 12345
 *b) 15
 *c) 135
 *d) 145
 *
 *
 *ANS:d
 **/
/*Explanation: The catch statements are written in the order: more specific to more general. In the code above, a new exception of type Exception is thrown. First the code jumps to first catch block to look for exception handler. But since the IOException is not
of the same type it is moves down to second catch block and finally to the third, where
the exception is caught and 4 is printed. Therefore, the answer is 145, as the order
of execution in terms of blocks is: try->catch->finally.*/
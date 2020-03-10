package com.capgemini.quiz.day8;
/**
 * 
 * Output ?
 *
 */
public class McqOne {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		s1.substring(4);
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
	}
}
/**
 * A) -1
 * B) 3
 * C) 4
 * D) A StringIndexOutOfBoundsException is thrown at runtime.
 * 
 * 
 * ANS:C
 */

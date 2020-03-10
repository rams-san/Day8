package com.capgemini.quiz.day8;
/*Output*/
public class McqEight {
	private int data = 5;

	public int getData() {
		return this.data;
	}

	public int getData(int value) {
		return (data + 1);
	}

	public int getData(int... value) {
		return (data + 2);
	}

	public static void main(String[] args) {
		McqEight temp = new McqEight();
		System.out.println(temp.getData(7, 8, 12));
	}
}
/*a) Either Compile time or Runtime error
 *b) 8
 *c) 10
 *d) 7
 *
 *
 *
 *ANS:d
 **/
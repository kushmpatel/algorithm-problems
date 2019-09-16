package com.interviewbit;

/**
 * This program simply calculates how many digit are there for a particular integer input
 * 
 *
 */
public class CalNumberOfDigit {

	public static void main(String args[]) {
		int N = 459846098;
		System.out.println("Math.log10(N) => "+Math.log10(N));
		N = (int) (Math.floor(Math.log10(N)) + 1);
		System.out.println(N);
	}
}

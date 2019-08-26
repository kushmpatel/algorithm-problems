package com.interviewbit;

/**
 * This program simply calculates how many digit are there for a particular integer input
 * @author asite
 *
 */
public class CalNumberOfDigit {

	public static void main(String args[]) {
		int N = 2545;
		N = (int) (Math.floor(Math.log10(N)) + 1);
		System.out.println(N);
	}
}

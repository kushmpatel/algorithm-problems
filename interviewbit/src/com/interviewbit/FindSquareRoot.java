package com.interviewbit;

/**
 * Find square root of a given number using binary search.
 * 
 *
 */
public class FindSquareRoot {

	public static void main(String [] args) {
		System.out.println(new FindSquareRoot().squareRoot(25));
	}
	
	public double squareRoot(int number) {
		double temp;

		double sr = number / 2;

		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	    }
}

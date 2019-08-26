package com.interviewbit;

/**
 * It will find most significant number of a given integer.
 * e.g input = 938567
 * output = 9
 * @author asite
 *
 */
public class MostSignificantNumber {

	public static void main(String args[]) {
		int N = 82683;
		double K = Math.log10(N);
		System.out.println("K = "+K);
		K = K - Math.floor(K);
		System.out.println("K - Math.floor(K) = "+K);
		int X = (int)Math.pow(10, K);
		System.out.println("Most Significant Number = "+X);
	}
}

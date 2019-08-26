package com.interviewbit;

import java.util.ArrayList;

/**
 *  Find prime numbers from 0 - given number.
 *  e.g. input - 17
 *  output - [2, 3, 5, 7, 11, 13, 17]
 * @author asite
 *
 */
public class PrimeNumbers {
	public static void main(String args[]) {
		System.out.println(new PrimeNumbers().sieve(17));
	}

	private ArrayList<Integer> sieve(int A) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i=2;i<=A;i++) {
			if(isPrime(i)) {
				output.add(i);
			}
		}
		return output;
	}
	
	boolean isPrime(int A) {
		
		if(A<=1)
			return false;
		
		for(int i=2;i<A;i++) {
			if(A%i==0) {
				return false;
			}
		}
		
		return true;
	}
}

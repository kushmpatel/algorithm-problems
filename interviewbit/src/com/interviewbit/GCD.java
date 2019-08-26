package com.interviewbit;

/**
 * Find greatest common divisor of given two numbers.
 * e.g Factors of 36 = [1, 2, 3, 4, 6, 9, 12, 18, 36]
 * 		Factors of 42 = [1, 2, 3, 6, 7, 14, 21, 42]
 * Now greatest common factor between these two numbers  = 6.
 * so output will be - 6.
 * 
 * @author asite
 *
 */
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new GCD().gcd(36, 42));
	}
	
	 public int gcd(int A, int B) {
		 if (B == 0) 
		        return A; 
		      return gcd(B, A % B);  
	    }

}

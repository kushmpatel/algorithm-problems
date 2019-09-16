package com.interviewbit;

import java.util.stream.IntStream;
/**
 *  Convert Given Integer to binary format.
 * 
 *
 */
public class DigitToBonary {

	public static void main(String args[]) {
		System.out.println(new DigitToBonary().findDigitsInBinary(18));
	}
	
	public String findDigitsInBinary(int A) {
		String output = "";
		if(A==0) {
			return "0";
		}
		while(A>0) {
			int rem = A%2;
			output = output + rem;
			A = A/2;
		}
		
		int length = output.length();
		String revers= "";
		for(int i=length-1;i>=0;i--) {
			revers = revers + output.charAt(i);
		}
		return revers;
    }
}

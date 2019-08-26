package com.interviewbit;

import java.util.ArrayList;

/**
 * This program will find factors of given integer.
 * e.g input = 18
 * 		output = [1, 2, 3, 6, 9, 18]
 * @author asite
 *
 */
public class FindFactors {
	
	public static void main(String args[]) {
		System.out.println(new FindFactors().allFactors(42));
	}

	public ArrayList<Integer> allFactors(int A) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i=1;i<=A;i++) {
			if(A%i==0) {
				output.add(i);
			}
		}
		return output;
    }
}


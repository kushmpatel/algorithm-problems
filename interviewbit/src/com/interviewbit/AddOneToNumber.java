package com.interviewbit;

import java.util.ArrayList;

public class AddOneToNumber {

	public static void main(String args[]) {
		AddOneToNumber add = new AddOneToNumber();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(0);
		add.plusOne(input);
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		ArrayList<Integer> output = new ArrayList();
		ArrayList<Integer> reverseOutput = new ArrayList();
		int originalNumber = 0;
		int size = A.size() - 1;
		for (int i = 0; i < A.size(); i++) {
			if(i==0 && A.get(i)==0) {
				originalNumber=0;
				break;
			}
			originalNumber = originalNumber + ((int) Math.pow(10, size) * A.get(i));
			size--;
		}
		originalNumber++;
		System.out.println("Original Number == " + originalNumber);

		while ((originalNumber / 10) >= 0) {
			output.add(originalNumber % 10);
			originalNumber = originalNumber / 10;
			if(originalNumber ==0)
			break;
		
		}
		System.out.println("Final output:-"+output);
		for(int i=output.size()-1;i>=0;i--) {
			reverseOutput.add(output.get(i));
		}
		System.out.println("Final Reverse output:-"+reverseOutput);
		return reverseOutput;
	}
}

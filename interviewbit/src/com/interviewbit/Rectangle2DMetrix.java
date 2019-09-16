package com.interviewbit;

import java.util.ArrayList;

public class Rectangle2DMetrix {

	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 3; i++) {
			input.add(new ArrayList<Integer>());
			for (int j = 0; j < 3; j++) {
				input.get(i).add(0);
			}
		}
		// print(input);
		// System.out.println(new Rectangle2DMetrix().prettyPrint(3));
		new Rectangle2DMetrix().print(new Rectangle2DMetrix().prettyPrint(3));

	}

	public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
		int capacity = A * 2 - 1;

		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < capacity; i++) {
			input.add(new ArrayList<Integer>());
			for (int j = 0; j < capacity; j++) {
				input.get(i).add(0);
			}
		}
		int k = A;
		for (int i = 0; i < A; i++) {
			for (int j = i; j < (capacity) - i; j++) {
				input.get(i).set(j, k);
			}

			for (int j = i + 1; j < capacity - i; j++) {
				input.get(j).set(capacity - i - 1, k);
			}

			for (int j = capacity - i - 2; j >= i; j--) {
				input.get(capacity - i - 1).set(j, k);
			}

			// add first col
			for (int j = capacity - i - 2; j > i; j--) {
				input.get(j).set(i, k);
			}
			
			k = k-1;

		}
		return input;

	}

	public static void print(ArrayList<ArrayList<Integer>> input) {
		for (int i = 0; i < input.size(); i++) {
			for (int j = 0; j < input.get(i).size(); j++) {
				System.out.print(" " + input.get(i).get(j) + " ");
			}
			System.out.println("\n");
		}
	}
}

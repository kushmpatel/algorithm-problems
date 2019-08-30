package com.interviewbit;

/**
 * It is a simple program which search an element from a sorted array using binary search algorithm.
 *
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 6, 9, 13, 14, 18 };
		System.out.println(new BinarySearch().binarySearch(input, input.length, 14));
	}

	public int binarySearch(int[] input, int size, int target) {
		int start = 0;
		int end = size - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (input[mid] == target) {
				return mid;
			} else if (input[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

}

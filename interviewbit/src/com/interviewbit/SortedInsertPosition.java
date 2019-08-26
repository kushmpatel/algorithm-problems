package com.interviewbit;

import java.util.ArrayList;

public class SortedInsertPosition {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(7);
		a.add(11);
		a.add(29);

		System.out.println(new SortedInsertPosition().searchInsert(a, 9));
	}

	public int searchInsert(ArrayList<Integer> input, int target) {
		int start = 0;
		int end = input.size() - 1;
		while (start <= end) {

			int mid = (start + end) / 2;

			if (input.get(mid) == target) {
				return mid;
			} else if (input.get(mid) >= target) {
				end = mid - 1;
			} else if (input.get(mid) <= target) {
				start = mid + 1;
			}
		}

		return start;
	}

	public int binarySearch(ArrayList<Integer> input, int target) {
		int start = 0;
		int end = input.size() - 1;
		while (start <= end) {

			int mid = (start + end) / 2;

			if (input.get(mid) == target) {
				return mid;
			} else if (input.get(mid) >= target) {
				end = mid - 1;
			} else if (input.get(mid) <= target) {
				start = mid + 1;
			}
		}

		return start;
	}

}

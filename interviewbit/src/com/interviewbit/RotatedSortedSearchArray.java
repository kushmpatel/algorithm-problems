package com.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class RotatedSortedSearchArray {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(101);
		input.add(103);
		input.add(106);
		input.add(109);
		input.add(158);
		input.add(164);
		input.add(182);
		input.add(187);
		input.add(202);
		input.add(205);
		input.add(2);
		input.add(3);
		input.add(32);
		input.add(57);
		input.add(69);
		input.add(74);
		input.add(81);
		input.add(99);
		input.add(100);
		
		

		System.out.println(new RotatedSortedSearchArray().search(input, 202));
	}

	public int search(final List<Integer> a, int b) {
		int size = a.size();
		int low = 0;
		int high = size - 1;
		int mid = 0;
		int minimumIndex = findMin(a);
		if (minimumIndex != -1) {
			if(b == a.get(minimumIndex)) {
				return minimumIndex;
			}
			if (b > a.get(minimumIndex)) {
				if (b <= a.get(high)) {
					return binarySearch(a, minimumIndex + 1, high, b);
				} else if(b >= a.get(low)) {
					return binarySearch(a, low, minimumIndex -1, b);
				}
			}
		}

	
		return -1;
	}

	public int findMin(final List<Integer> a) {
		int size = a.size();
		int low = 0;
		int high = size - 1;
		int mid = 0;

		while (low <= high) {

			if (a.get(low) <= a.get(high)) {
				return low;
			}
			mid = (low + high) / 2;
			int next = (mid + 1) % size;
			int prev = (mid + size - 1) % size;
			if (a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)) {
				return mid;
			}

			if (a.get(mid) <= a.get(high)) {
				high = mid - 1;
			}

			if (a.get(mid) >= a.get(low)) {
				low = mid + 1;
			}
		}
		return -1;
	}

	public int binarySearch(List<Integer> input, int start, int end, int target) {

		while (start <= end) {
			int mid = (start + end) / 2;

			if (input.get(mid) == target) {
				return mid;
			} else if (input.get(mid) > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

}

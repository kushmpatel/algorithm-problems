package com.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class RotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
		input.add(12);
		input.add(30);
		input.add(3);
		
		System.out.println(new RotatedArray().findMin(input));
	}

	public int findMin(final List<Integer> a) {
		int size = a.size();
		int low = 0;
		int high = size - 1;
		int mid = 0;

		while (low <= high) {
			

			if(a.get(low) <= a.get(high)) {
				return a.get(low);
			}
			mid = (low + high) / 2;
			int next = (mid + 1) % size;
			int prev = (mid + size - 1) % size;
			if (a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)) {
				return a.get(mid);
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

}

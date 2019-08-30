package com.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * From given list of integer, how can you generate largest integer using all those list integer values ?
 * e.g. input = [54,546,548,60]
 * 		output = 6054854654
 * 
 *
 */
public class LargestNumberFromGivenArray {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		// output should be 6054854654
		arr.add(54);
		arr.add(546);
		arr.add(548);
		arr.add(60);
		System.out.println(new LargestNumberFromGivenArray().largestNumber(arr));
	}

	public String largestNumber(final List<Integer> arr) {
		StringBuffer output = new StringBuffer();
		Collections.sort(arr, new Comparator<Integer>() {

			// A comparison function which is used by
			// sort() in printLargest()
			@Override
			public int compare(Integer X, Integer Y) {

				// first append Y at the end of X
				String XY = X.toString() + Y.toString();

				// then append X at the end of Y
				String YX = Y.toString() + X.toString();

				// Now see which of the two formed numbers
				// is greater
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});

		Iterator it = arr.iterator();
		int sum = 0;
		while (it.hasNext()) {
			Integer next = (Integer) it.next();
			output.append(next);
			sum = sum + (int)next;
		}

		if (sum == 0) {
			return "0";
		} else {
			return output.toString();
		}
	}
}

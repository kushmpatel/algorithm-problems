package com.interviewbit;

import java.util.ArrayList;
import java.util.List;

/**
 * For a given list of integer values , it will find an occurrence of a given particular value. 
 * e.g. input = [3,3,4,4,4,4,6,6,6,7,7,8] and you want to find occurrence of 6
 * 		output = 3 
 * @author asite
 *
 */
public class FindOccurenceOfNumber {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(1);
		input.add(2);
		input.add(2);
		input.add(2);
		input.add(5);
		
		System.out.println(new FindOccurenceOfNumber().findCount(input, 2));
	}

	public int binarySearch(List<Integer> input, int size, int target,boolean searchFirst) {
		int start = 0;
		int end = size - 1;
		int result = -1;	
		while (start <= end) {
			int mid = (start + end) / 2;

			if (input.get(mid) == target) {
				result = mid;
				if(searchFirst) {
					end = mid -1;
				} else {
					start = mid + 1;
				}
			} else if (input.get(mid) > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return result;
	}
	
	public int findCount(final List<Integer> A, int B) {
		int firstOccurIndex = binarySearch(A, A.size(), B,true);
		int lastOccurIndex = binarySearch(A,A.size(), B,false);
		if(firstOccurIndex != -1 && lastOccurIndex != -1) {
			return lastOccurIndex -  firstOccurIndex + 1;
		}
		return -1;
    }

}

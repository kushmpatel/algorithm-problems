package com.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class SearchMatrix {

	public static void main(String[] args) {
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(3);
		row1.add(7);
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		row2.add(9);
		row2.add(11);
		row2.add(15);
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		row3.add(17);
		row3.add(27);
		row3.add(37);

		ArrayList<ArrayList<Integer>> columns = new ArrayList();
		columns.add(row1);
		columns.add(row2);
		columns.add(row3);

		// TODO Auto-generated method stub
		System.out.println(new SearchMatrix().searchMatrix(columns, 17));
	}

	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		int rowCount = a.size();
		int columnCount = a.get(0).size();
		boolean flag = false;
		for (int i = 0; i < rowCount; i++) {
			if (b >= a.get(i).get(0) && b <= a.get(i).get(columnCount - 1)) {
				if (binarySearch(a.get(i), 0, columnCount - 1, b)) {
					flag = true;
					break;
				}
			} else if (i > 0 && b > a.get(i - 1).get(columnCount - 1) && b < a.get(i).get(0)) {
				break;
			}
		}
		if(flag==true) 
			return 1;
		else 
			return 0;
	}

	public boolean binarySearch(ArrayList<Integer> input,int start,int end, int target) {
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (input.get(mid) == target) {
				return true;
			} else if (input.get(mid) > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return false;
	}

}

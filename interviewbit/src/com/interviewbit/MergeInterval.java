package com.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

Example 2:

Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

Make sure the returned intervals are also sorted.
 * 
 *
 */
public class MergeInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> listIntervals = new ArrayList<Interval>();
		listIntervals.add(new Interval(1, 7));
		listIntervals.add(new Interval(11, 15));
		listIntervals.add(new Interval(1, 3));
		listIntervals.add(new Interval(9, 12));
		listIntervals.add(new Interval(7, 8));
		listIntervals.add(new Interval(2, 4));
		listIntervals.add(new Interval(13, 18));
	
	

		Collections.sort(listIntervals);
		System.out.println("Sorted = " + listIntervals);

		//System.out.println(merge(listIntervals));
		System.out.println(insert(listIntervals, new Interval(11,14)));
	}

	/*
	 * public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
	 * ArrayList<Interval> output = new ArrayList<Interval>(); Interval merged =
	 * intervals.get(0); for(int i=1;i<intervals.size();i++) { Interval next =
	 * intervals.get(i); if(merged.end >= next.start) { if(merged.end > next.end) {
	 * merged = new Interval(merged.start,merged.end ); } else { merged = new
	 * Interval(merged.start,next.end ); } //output.add(outputInterval); if(i
	 * ==(intervals.size()-1) ) { output.add(merged); } } else { output.add(merged);
	 * merged = next; } } //System.out.println(output); return output; }
	 */

	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		if (intervals == null)
			return null;

		Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		ArrayList<Interval> merged = new ArrayList<>();

		for (Interval current : intervals) {
			if (merged.isEmpty() || merged.get(merged.size() - 1).end < current.start) {
				merged.add(current);
			} else {
				merged.get(merged.size() - 1).end = Math.max(current.end, merged.get(merged.size() - 1).end);
			}
		}
		return merged;
	}

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		if (intervals == null)
			return null;
		
		intervals.add(newInterval);

		Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		ArrayList<Interval> merged = new ArrayList<>();

		for (Interval current : intervals) {
			if (merged.isEmpty() || merged.get(merged.size() - 1).end < current.start) {
				merged.add(current);
			} else {
				merged.get(merged.size() - 1).end = Math.max(current.end, merged.get(merged.size() - 1).end);
			}
		}
		return merged;
	}
}

class Interval implements Comparable<Interval> {
	@Override
	public String toString() {
		return "(" + start + ", " + end + ") ";
	}

	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	@Override
	public int compareTo(Interval obj) {
		if (this.start == (obj).start) {
			if (this.end > obj.end) {
				return 0;
			} else {
				return -1;
			}

		} else if (this.start > (obj).start) {
			return 1;
		}
		return -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + end;
		result = prime * result + start;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interval other = (Interval) obj;
		if (end != other.end)
			return false;
		if (start != other.start)
			return false;
		return true;
	}

}

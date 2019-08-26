package com.interviewbit;

/**
 * Find square root of a given number using binary search.
 * @author asite
 *
 */
public class FindSquareRoot {

	public static void main(String [] args) {
		System.out.println(new FindSquareRoot().findSquareRoot(2147483647));
	}
	
	public int findSquareRoot(int x) {
        // Base Cases 
        if (x == 0 || x == 1) 
            return x; 
  
        // Do Binary Search for floor(sqrt(x)) 
        long start = 1, end = x, ans=0; 
        while (start <= end) 
        { 
            long mid = (start + end) / 2; 
            long check = mid*mid;
            // If x is a perfect square 
            if (check == x) 
                return (int)mid; 
  
            // Since we need floor, we update answer when mid*mid is 
            // smaller than x, and move closer to sqrt(x) 
            if (check < x) 
            { 
                start = mid + 1; 
                ans = mid; 
            } 
            else   // If mid*mid is greater than x 
                end = mid-1; 
        } 
        return (int)ans; 
	}
}

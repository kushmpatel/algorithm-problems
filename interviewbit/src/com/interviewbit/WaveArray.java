package com.interviewbit;

import java.util.ArrayList;

public class WaveArray {
	
	public static void main(String args[]) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(6);
		input.add(17);
		input.add(15);
		input.add(13);
	
		
		WaveArray waveArray = new WaveArray();
		System.out.println(waveArray.wave(input));
	}
	
	public ArrayList<Integer> wave(ArrayList<Integer> A) {
		int size = A.size();
		for(int i=0;i<size;i=i+2) {
			if( i != size-1) {
				int current = A.get(i);
				int next = A.get(i+1);
				if(next >= current) {
					A.set(i, next);
					A.set(i+1, current);
				}
				
			} else if(i == size-1) {
				int current = A.get(i);
				int next = A.get(0);
				if(next <= current) {
					A.set(i, next);
					A.set(i+1, current);
				}
			}
		}
		return A;
    }

}



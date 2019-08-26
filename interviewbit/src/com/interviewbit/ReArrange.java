package com.interviewbit;

import java.util.ArrayList;

public class ReArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(0);
		a.add(2);
		a.add(1);
		new ReArrange().arrange(a);
		System.out.println(a);
	}
	
	public void arrange(ArrayList<Integer> a) {
		int n = a.size();
		for(int i=0;i<a.size();i++) {
			a.set(i, a.get(i)+(a.get(a.get(i))%n)*n);
		}
		for(int i=0;i<n;i++) {
			a.set(i, a.get(i)/n);
		}
    }

}

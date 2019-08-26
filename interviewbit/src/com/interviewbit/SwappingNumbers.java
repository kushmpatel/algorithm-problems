package com.interviewbit;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		a ^= b; 
		b ^= a; 
		a ^= b;
		
		System.out.println("A == "+a);
		System.out.println("B == "+b);
	}

}

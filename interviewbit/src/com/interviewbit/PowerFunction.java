package com.interviewbit;

public class PowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PowerFunction().pow(999999999,999999999, 7));
	}
	
	 public int pow(int x, int n, int d) {
		 if(x > 0 && n == 0) {
			 return 1;
		 }
		 if(x==0 && n==0) {
			 return 0;
		 }
		 
		 long ans = 1;
		 long base = x;
		 
		 while(n > 0) {
			 
			 if(n%2 == 1) {
				 ans = (ans*base)%d;
				 n--;
			 } else
			 {
				 base = (base*base) % d;
				 n= n / 2;
			 }
		 }
		 
		 if(ans < 0) {
			 ans = (ans + d) % d;
		 }
		 
		 return (int) ans;
	    }

}

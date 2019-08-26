package com.interviewbit;

public class IsPower {

	public static void main(String[] args) {
		System.out.println(new IsPower().isPower(17));
	}
	
	public int isPower(int A) {
		int i=2;
		int limit = A/2;
		int power = 1;
		if(A==1)
			return 1;
		for(;i<=A;) {
			if(A%i>0) {
				System.out.println(A+" % "+i+" == "+A%i);
				i++;
				power=1;
			} else if(A%i==0) {
				System.out.println(A+" / "+ i +" == "+A/i);
				//A = A/i;
				power++;
				System.out.println("Math.pow("+i+","+ power+") == "+Math.pow(i, power));
				if(power !=1 && A==Math.pow(i, power)) {
					return 1;
				}
				continue;
			}
			
		}
		
		return 0;
    }
}


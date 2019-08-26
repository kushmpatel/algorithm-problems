package com.interviewbit;

public class TotalSubString {

	public static void main(String[] args) {
		//new TotalSubString().subString("ABED");
		System.out.println(new TotalSubString().subString("ABEDF"));
	}
	
	public int subString(String input) {
		int count =0;
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<=input.length();j++) {
				StringBuffer subString = new StringBuffer(input.substring(i, j).trim());
				
				  if(subString.charAt(0) == 'a' || subString.charAt(0) == 'e' ||
				  subString.charAt(0) == 'i' || subString.charAt(0) == 'o' ||
				  subString.charAt(0) == 'u' || subString.charAt(0) == 'A'||
				  subString.charAt(0) == 'E'|| subString.charAt(0) == 'I' ||
				  subString.charAt(0) == 'O'|| subString.charAt(0) == 'U') { count++; }
				 
				//count++;
				
			}
		}
		
		return count%10003;
	}

}

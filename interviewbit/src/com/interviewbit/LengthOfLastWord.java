package com.interviewbit;

/**
 * For a given string it will print length of last word.
 * e.g. input = kush mukeshbhai Patel
 * now here last work is Patel so output = 5
 * @author asite
 *
 */
public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(new LengthOfLastWord().lengthOfLastWord("kush mukeshbhai Patel"));
	}

	 public int lengthOfLastWord(final String A) {
		 String input = A.trim();
		 int length = 0;
		 for(int i=0;i<input.length();i++) {
			 char c = input.charAt(i);
			 if(c == ' ') {
				 length=0;
			 } else {
				 length++;
			 }
		 }
		 
		 return length;
	    }
}

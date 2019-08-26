package com.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  It will check whether string is palindrome or not
 * @author asite
 *
 */
public class PalindromeString {

	public static void main(String[] args) {
		/*
		 * char a = 'z'; int val = a; System.out.println(val);
		 */
		System.out.println(new PalindromeString().palindrome("1a2"));
	}

	public int palindrome(String input) {
		input = input.toLowerCase();
		char[] charArray = input.toCharArray();
		ArrayList<Character> listInt = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			int iVal = charArray[i];
			if (((iVal >= 65 && iVal <= 90) || (iVal >= 97 && iVal <= 122) || (iVal >= 48 && iVal <= 57))) {
				listInt.add(charArray[i]);
			}
		}
		for (int i = 0, j = listInt.size() - 1; (i <= (listInt.size() - 1) / 2
				&& j >= (listInt.size() - 1) / 2); i++, j--) {

			if (listInt.get(i) != listInt.get(j)) {
				return 0;
			}
		}
		return 1;
	}
}

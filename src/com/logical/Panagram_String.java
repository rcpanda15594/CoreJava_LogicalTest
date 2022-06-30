package com.logical;

// Check the String contains all 26 alphabets or not(Panagram)
public class Panagram_String {

	public static void main(String[] args) {

		String s = "The Quick brown fox jumps over the lazy dog";
		System.out.println(checkPanagram(s.toLowerCase()));

	}

	private static boolean checkPanagram(String s) {
		if (s.length() < 26) {
			return false;
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.println(ch);
				if (s.indexOf(ch) < 0) {
					return false;
				}
			}
		}

		return true;
	}

}

package com.logical;

public class First_Letter_OfEach_Word {

	public static void main(String[] args) {

		String s = "I Love My India";

		String[] c = s.split(" ");
		for (String c1 : c) {
			System.out.println(c1.charAt(0) + "==" + c1);
		}
	}

}

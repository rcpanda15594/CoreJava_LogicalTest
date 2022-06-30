package com.logical;

import java.util.Scanner;

//No Of Occurrences Of Char (get how many times a character available)
public class NoOfOccurencesOfChar {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your String :");
	String s = sc.nextLine();
	System.out.println(s);
		int intialLength = s.length();
		String s1 = s.replace("i", "");
		int afterReplace = s1.length();
		
		System.out.println(intialLength);
		System.out.println(afterReplace);
		System.out.println("No of occurance of charcter is"+(intialLength-afterReplace));
	}

}

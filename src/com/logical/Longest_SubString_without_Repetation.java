package com.logical;

import java.util.HashSet;
import java.util.Set;

//Find Longest SubString without repetition of characters

public class Longest_SubString_without_Repetation {

	public static void main(String[] args) {

		String s = "abcdab";
		System.out.println(longest(s));
	}

	private static String longest(String s) {

		Set<Character> set = new HashSet<>();
		String longestTillNow = "";
		String totalLogest = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			//System.out.println("String Characters are "+c);
			if(set.contains(c)){
				set.clear();
				longestTillNow = "";
			}
			set.add(c);
			longestTillNow+= c;
		//	System.out.println(set);
			//System.out.println(longestTillNow);

			if(longestTillNow.length() > totalLogest.length()){
				totalLogest = longestTillNow;
			}
			//System.out.println(totalLogest);
		}
		return totalLogest;
		
	}

}

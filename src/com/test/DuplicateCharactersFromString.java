package com.test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersFromString {

	public static void main(String[] args) {
		String str1 = "India";
		String str = str1.toUpperCase();
		System.out.println(str.length()-1);
		/*for (int i = 0; i < str.length(); i++) {
			
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {

					System.out.print(str.charAt(i));
				}
			}

		}*/
		
		/*Set<Character> uniqueChars = new HashSet<Character>();
		Set<Character> repeats = new HashSet<Character>();
		for(int i = 0; i < str.length(); i++) {
		    if (!uniqueChars.add(str.charAt(i))) {
		        repeats.add(str.charAt(i));
		    }
		}

		System.out.print(repeats);*/
		
		
		String duplicates = "";

	    for (int i = 0; i < str.length() - 1; i++) {
	        for (int j = i + 1; j < str.length(); j++)

	        {
	            if (str.charAt(i) == str.charAt(j)) {

	                if (!duplicates.contains(String.valueOf(str.charAt(j)))) {
	                    duplicates += str.charAt(j);
	                    break;
	                }

	            }
	        }
	    }

	    System.out.println(duplicates);
	}

}

package com.test;

//Reverse a String without using String methods

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		
		  String str = "INDIA";
          StringBuilder str2 = new StringBuilder();
          str2.append(str);
          str2 = str2.reverse();     // used string builder to reverse
         System.out.println(str2);
		
		
		
	}
	
	
	
	
	
	
}

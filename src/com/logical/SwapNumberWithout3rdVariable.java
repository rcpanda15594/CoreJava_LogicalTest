package com.logical;

import java.util.Scanner;

public class SwapNumberWithout3rdVariable {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Enter First Number :");
		int firstNumber = s.nextInt();
		System.out.println("Enter Second Number :");
		int secondNumber = s.nextInt();
		
		System.out.println("Your Origial Numbers are : First Numer="+firstNumber+",Second Number="+secondNumber);
		firstNumber = firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		System.out.println("Your Swap Numbers are : First Numer="+firstNumber+",Second Number="+secondNumber);
	}

}

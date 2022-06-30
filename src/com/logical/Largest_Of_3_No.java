package com.logical;

import java.util.Scanner;

public class Largest_Of_3_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number:");
		int no1 = sc.nextInt();

		System.out.println("Enter 2nd Number:");
		int no2 = sc.nextInt();
		
		System.out.println("Enter 3rd Number:");
		int no3 = sc.nextInt();
		
		if((no1 >no2) && (no1 > no3)){
			System.out.println("No1 is largest no");
		}
		if((no2 >no1) && (no2 > no3)){
			System.out.println("No2 is largest no");
		}
		if((no3 >no2) && (no3 > no1)){
			System.out.println("No3 is largest no");
		}
		else{
			System.out.println("None of them");
		}
	}
}

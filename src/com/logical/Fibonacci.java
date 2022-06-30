package com.logical;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		/*int a =100,b=0,c=1; 
		System.out.println("Up to "+a);
		
		while (b<=a) {
			
			int sum = b+c;
			System.out.println(sum);
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:");
		int no = sc.nextInt();
		
		if(no>0){
			feboCheck(no);
		}else{
			System.out.println("Please Enter +ve No");
		}
		
	}

	private static void feboCheck(int no) {
		int f1,f2=0,f3=1;

	for(int i =1;i<=no;i++){
		System.out.println(f3);
		f1=f2;
		f2=f3;
		f3 = f1+f2;
	//	System.out.println(f3);

	}
	}

}

package com.logical;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 2, 30, 55, 22, 5, 547, 97 };
		System.out.println("Before Bubble Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		bubbleCheck(a);
		System.out.println("After Bubble Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void bubbleCheck(int[] a) {
		int length = a.length;
		int temp = 0;

		for (int i = 0; i < length; i++) {
			System.out.println("i :" + i);
			for (int j = 1; j < (length - 1); j++) {
				System.out.println("j :" + j);
				if (a[j - 1] > a[j]) {
					// swap elements
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}

package com.blabz.java;

import java.util.Scanner;

public class SumOfIntegerAddssZero {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of Array: ");
		int number = sc.nextInt();
		Sum0Count(number); 							//** error
	}

	static void Sum0Count(int number) {
		int[] arr = new int[number];
		int count = 0;
		System.out.println("Enter Array Elements: ");
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < number; i++) {
			for (int j = i + 1; j < number; j++) {
				for (int k = j + 1; j < number; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {		// ** error
						count++;
						System.out.println(arr[i] + " + " + arr[j] + " + 3" + arr[k] + " = " + " 0");
					}
				}
			}
		}
		System.out.println("Number of pairs: " + count);
	}

}

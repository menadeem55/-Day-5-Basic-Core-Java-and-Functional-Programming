package com.blabz.java;

import java.util.Scanner;

public class LargestThreeNumber {

	public static void main(String[] args) {
		int x, y, z;
		System.out.println("Enter three Largest number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		x = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		y = sc.nextInt();
		System.out.println("Enter 3rd number");
		z = sc.nextInt();

		if (x > y && x > z)
			System.out.println("First number is the Largest. ");
		else if (y > x && y > z)
			System.out.println("Second number is the Largest. ");
		else if (z > x && z > y)
			System.out.println("Third number is the Largest. ");

		else
			System.out.println("The number are not distinct");

	}

}

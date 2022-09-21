package com.blabz.java;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c = sc.nextInt();

		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);         	// the value of a b c are in the negative number
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);

		System.out.println("Root of the given equations are: ");
		System.out.println(x1);
		System.out.println(x2);

	}

}

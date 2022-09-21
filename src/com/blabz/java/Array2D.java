package com.blabz.java;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows");
		int n = sc.nextInt(); //taking n is for rows

		System.out.println("Enter the columns");
		int m = sc.nextInt();	//taking n is for rows column

		System.out.println("You are creating array of size: " + m + "x" + n);
		System.out.println("Cases for 2D Array");

		System.out.println("1  ==>>  Integer");
		System.out.println("2  ==>>  Double");
		System.out.println("3  ==>>  Boolean");
		int Case = sc.nextInt();

		switch (Case) {
		case 1:
			System.out.println("For interger type array, plase Enter number for rows and coloum");
				// input 
			int arr[][] = new int[n][m];
			for (int i = 0; i < n; i++) {  // i is for the rows
				for (int j = 0; j < m; j++) {	// j is for the coloum
					arr[i][j] = sc.nextInt();

				}
			}		
					// output
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(" " + arr[i][j]);
				}
				System.out.println(" ");
				
			} 
			break;
		case 2:
			System.out.println("For double type array, please Enter for rows and coloumn");

			double arrD[][] = new double[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arrD[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					System.out.println(" " + arrD[i][j]);
				}
				System.out.println(" ");
			}
			break;

		case 3:
			System.out.println("For boolean type array, please enter values for rows and columns");

			boolean arrB[][] = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arrB[i][j] = sc.nextBoolean();
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					System.out.println(" " + arrB[i][j]);
				}
				System.out.println(" ");
			}
			break;
		default:
		}
	}

}

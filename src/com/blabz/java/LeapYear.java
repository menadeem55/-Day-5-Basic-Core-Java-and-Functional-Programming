package com.blabz.java;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int y;
		System.out.println("Enter any Year ");
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		
			if (y % 400 == 0 || y % 100 != 0 && y % 4 == 0)

			{
				System.out.println("This is Leap Year");
			} else {
				System.out.println("This is not a Leap Year");
			}
	}

}

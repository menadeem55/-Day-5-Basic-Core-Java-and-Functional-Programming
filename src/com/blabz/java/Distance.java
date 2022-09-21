package com.blabz.java;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		int x;
		int y;
		double distance =0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cvalue of x: ");;
		x = sc.nextInt();
		
		System.out.println("Enter the value of y: ");
		y= sc.nextInt();
			distance = ((double)Math.pow((x * x + y * y),0.5));
			
				System.out.println("distance is :"+distance);
	}

}

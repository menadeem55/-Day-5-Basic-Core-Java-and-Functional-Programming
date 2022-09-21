package com.blabz.java;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Number - ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double result = 0.00;
		
		for(int i=num; i>0 ; i--) {
			result = result + (double) 1/ num;
			System.out.println(result + " ");
		}
		
		
	}

}

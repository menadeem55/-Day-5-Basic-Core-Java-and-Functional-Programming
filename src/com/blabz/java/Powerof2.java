package com.blabz.java;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		if(n>0 && n<31) {
			for(int i=1;i<=n;i++){
				System.out.println(i +" - "+Math.pow(2,i));
			}
		}
		else {
						
				System.out.println("Exceeds integer max value, please Enter a lower value");
		
		}

	}

	}

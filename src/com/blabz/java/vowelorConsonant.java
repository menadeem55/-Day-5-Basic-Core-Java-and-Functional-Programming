package com.blabz.java;

import java.util.Scanner;

public class vowelorConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Charcter: ");
			char ch = sc.next().charAt(0);
			
		switch(ch)
		{
		
			case 'A'	:
				System.out.println("This is Vowel: A");
				break;
				
			case 'E'	:
				System.out.println("This is vowel: E");
				break;
				
			case 'I'	:
				System.out.println("This is vowel: I");
				break;
				
			case 'O'	:
				System.out.println("This is vowel O");
				break;
				
			case 'U'	:
				System.out.println("This is vowel U");
				break;
				
				
				// in lower case
			case 'a'	:
				System.out.println("This is Vowel: a");
				break;
				
			case 'e'	:
				System.out.println("This is vowel: e");
				break;
				
			case 'i'	:
				System.out.println("This is vowel: i");
				break;
				
			case 'o'	:
				System.out.println("This is vowel o");
				break;
				
			case 'u'	:
				System.out.println("This is vowel u");
				break;
			default		:	
				
			System.out.println("Not an vowel: ");
	}
		
}
}

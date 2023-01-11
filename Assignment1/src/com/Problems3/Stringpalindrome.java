package com.Problems3;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, reverse = ""; // Objects of String class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a stringto check whether it is a palindrome or not: ");
		str = sc.nextLine();
		int length = str.length();
		int i;
		for (i = length - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		if (str.equals(reverse)){
			System.out.println(str+" is a palindrome");
		} 
		else {
			System.out.println(str+" is not a palindrome");
		}
	}

}

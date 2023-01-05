package com.Exception;

import java.util.Scanner;

public class ThrowandThrows {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if (num%2 == 0) {
			System.out.println(+num+" is divisble by 2 and it is even number");
			//throw new Exception(+num+" i am even number");
		}
		else {
			System.out.println(+num+" is not divisble by 2 and it is odd number ");
			throw new Exception(+num+" i am odd number");
		}
	}

}

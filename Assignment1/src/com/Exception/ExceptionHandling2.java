package com.Exception;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number to check even");
			int num=sc.nextInt();
			try {
				if(num % 2 == 0) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
			catch(Exception e){
					System.out.println("i am an exception");
				}
			System.out.println("enter a number to check odd");
			int num1=sc.nextInt();
			try {
				if(num1 % 2 == 1) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
			catch(Exception e){
					System.out.println("i am an Exception");
				}
			if(num / 1 != 0) {
				System.out.println("it is a number");
			}
			if(num1 / 1 != 0) {
				System.out.println("it is a number");
			}
			else {
				System.out.println("it is an alphabet");
			}
		}
		catch(Exception e){
			System.out.println("i am an Exception");
		}
	}

}

package com.Exception;

import java.util.Scanner;

public class SimpleInterestexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("***To calaculate Simple intrest***");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Principal balnace : ");
			int p = sc.nextInt();
			System.out.println("Rate of intrest is 7.4 by default");
			System.out.println("Enter time : ");
			int t = sc.nextInt();
			double r = 7.4;
			double st = (p * r * t) / 100;
			System.out.println("Simple intrest is: " + st);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

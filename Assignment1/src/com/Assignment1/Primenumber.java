package com.Assignment1;

public class Primenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("3 is not a prime number");
		} else {
			System.out.println("3 is a prime number");
		}
	}
}

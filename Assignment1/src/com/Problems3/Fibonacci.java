package com.Problems3;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		System.out.println(+num1);
		int num2=1;
		System.out.println(+num2);
		int num3;
		int i,count=5;
		for(i=2;i<count;i++) {
			num3=num1+num2;
			System.out.println(+num3);
			num1=num2;
			num2=num3;
		}
	}

}

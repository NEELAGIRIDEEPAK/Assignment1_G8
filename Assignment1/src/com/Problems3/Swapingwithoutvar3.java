package com.Problems3;

public class Swapingwithoutvar3 {
	public static void main (String[] args) {
		int a=3;
		int b=5;
		System.out.println("a value i:  "+a);
		System.out.println("b value is: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a value is: "+a);
		System.out.println("b value is "+b);
	}
}

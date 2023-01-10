package com.Problems3;

import java.util.Scanner;

public class MagicNumber {
	public static void main(String[] args) {
		int n,rem=1,num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is magic number or not :  ");
		n=sc.nextInt();
		num=n;
		while(num>9) {
			while(num>0){
				rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			num=sum;
			sum=0;
		}
		if(num==1) {
			System.out.println(+n+" is a Magic number");
		}
		else {
			System.out.println(+n+" is not a Magic number");
		}
	}
}

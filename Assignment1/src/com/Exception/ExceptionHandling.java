package com.Exception;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a number:");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			//Scanner num2= new Scanner(System.in);
			//System.out.println("enter a number:"+num2);
			int a=num1 / num2;
			System.out.println("i am executed without any exception");
		}
		catch(Exception e){
			System.out.println("i am an exception");
		}
		
	}

}

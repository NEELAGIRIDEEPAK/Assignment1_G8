package com.Assignment1;

public class Anonymous {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Santa s=new Santa() {
			public void gifts() {
				System.out.println("Santa gifted a Laptop");
			}
		};
		s.gifts();	
	}

}

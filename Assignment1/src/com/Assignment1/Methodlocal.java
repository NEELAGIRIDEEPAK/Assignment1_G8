package com.Assignment1;

public class Methodlocal {
	private String word= "Hi! Happy christmas...";
	void display() {
		class Localinner{
			void print() {
				System.out.println(word);
			}
		}
		Localinner li=new Localinner();
		li.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodlocal ml=new Methodlocal();
		ml.display();
	}

}

package com.Threadexample;

class NewThread2 extends Thread{
	public void run() {
		System.out.println("New Thread is created");
	}
}
public class NewThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for (int i=0; i<n; i++) {
			NewThread2 nt= new NewThread2();
			nt.start();
		}
	}

}

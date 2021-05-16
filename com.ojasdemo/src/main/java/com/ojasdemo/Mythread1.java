package com.ojasdemo;

public class Mythread1 extends Thread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Mythread mt=new Mythread() {
		public void run() {
			for (int i = 1; i <= 10; i++) {
	            System.out.println(5 + " * " + i + " = " + (5 * i));
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }

	 

	        }
	    }

	 
		};
		mt.start();

	}
	

}

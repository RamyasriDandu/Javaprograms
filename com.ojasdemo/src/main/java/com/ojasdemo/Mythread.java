package com.ojasdemo;

	public class Mythread extends Thread {

	

	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(5 + " * " + i + " = " + (5 * i));
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }

	 

	        }
	    }

	 
	public static void main(String[] args) {
		
		        // Thread
		        Mythread mt = new Mythread();
		        // Start The Thread
		        mt.start();


		    }
	}

		 

		
package com.ojasdemo;

public class Demojava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()-> {
			
				for (int i = 1; i <= 10; i++) {
		            System.out.println(5 + " * " + i + " = " + (5 * i));
		            try {
		                Thread.sleep(1000);
		            } catch (InterruptedException e) {
		              e.printStackTrace();
		            }

		
		        }
		    

			};
			Thread t=new Thread(r);
			t.start();

		}
		

	}


	


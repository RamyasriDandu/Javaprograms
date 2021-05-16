package com.ojasdemo;

public class Exampledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread r=new Thread(new Runnable() {
			public void run() {
			System.out.println(" welcome " +Thread.currentThread().getName());
		}

	});
		r.setName("my thread");
		r.start();
}

}

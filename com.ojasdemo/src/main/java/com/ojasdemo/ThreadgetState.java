package com.ojasdemo;

public class ThreadgetState {
	
	public static void main(String[] args) {
	
	Thread t=new Thread();// new thread is created//new
	t.start();//runnable
	System.out.println(t.getState());
}
}
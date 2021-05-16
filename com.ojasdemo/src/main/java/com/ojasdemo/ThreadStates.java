package com.ojasdemo;

public class ThreadStates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread.State st[]=Thread.State.values();
		for(Thread.State s:st) {
			System.out.println(s);
		}

	}

}

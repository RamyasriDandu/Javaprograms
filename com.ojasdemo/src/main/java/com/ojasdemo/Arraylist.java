package com.ojasdemo;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> names=new ArrayList<String>();
  names.add("ramya");
  names.add("sree");
  names.stream().forEach(x->System.out.println(x));
  System.out.println(names);
  
  }
	}



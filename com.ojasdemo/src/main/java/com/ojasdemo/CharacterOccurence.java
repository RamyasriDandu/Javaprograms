package com.ojasdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Map<Character,Integer> words=new HashMap<Character,Integer>();
       System.out.println("enter the name");
       String name=sc.next();
       char[] charname=name.toCharArray();
       for(char c:charname) {
    	   if(words.containsKey(c)) {
    		   words.put(c,words.get(c)+1);
    	   }else {
    		   words.put(c, 1);
    	   }
       }
       for(Map.Entry<Character, Integer>entry:words.entrySet()){
    	   System.out.println(entry.getKey()+ ""+entry.getValue());
	}

}
}

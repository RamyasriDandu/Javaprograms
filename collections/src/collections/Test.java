package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

			 public void main(String[] args) {
				 HashSet<Integer> sh=new HashSet<Integer>();
				 for(int i=1;i<=100;i++) {
					 sh.add(i);
				 }
				 Iterator<Integer> is=sh.iterator();
				 while(is.hasNext()) {
					 System.out.println(is.next());
				 }
			 }
			 
		 }
	
	



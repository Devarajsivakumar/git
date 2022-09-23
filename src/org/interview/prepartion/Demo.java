package org.interview.prepartion;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		
  Vector<Integer> v= new Vector<>();
  
  v.add(100);
  v.add(200);
  v.add(300);
  v.add(400);
  v.add(500);
  
  System.out.println(v);
  
  Enumeration<Integer> e = v.elements();
  
  while (e.hasMoreElements()) {
	Integer nextelement = (Integer) e.nextElement();
	
	System.out.println(nextelement);
	
}
	}

}



package org.interview.prepartion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveMethod {

	public static void main(String[] args) {
		
		List<Integer>l=new ArrayList<>();
		
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		System.out.println(l);
		
	      Iterator<Integer> iterator = l.iterator();
		
		//remove iterator method
		
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			
			System.out.println(next);
			
			if (next == 400) {
				
				iterator.remove();
		
			}
		}
		
		System.out.println(l);
	}

}

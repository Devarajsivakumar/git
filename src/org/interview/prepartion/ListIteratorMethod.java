package org.interview.prepartion;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod {
	
	public static void main(String[] args) {
	
	List<Integer>li= new ArrayList<>();
	
	
	li.add(100);
	li.add(200);
	li.add(300);
	li.add(400);
	
	System.out.println(li);
	
    ListIterator<Integer> listIterator = li.listIterator();
    
    System.out.println("Traverse in forward direction");
    
    while (listIterator.hasNext()) {
    	
    	Integer next = listIterator.next();
    	
    	System.out.println(next);
    }    
	
    System.out.println("Traverse in Backward direction");
    
    while (listIterator.hasPrevious()) {
		Integer previous = listIterator.previous();
		System.out.println(previous);
	
		if (previous==200) {
			
			listIterator.remove();
		}
	}
    System.out.println(li);
	}
}

package org.interview.prepartion;

import java.util.Scanner;

public class PrimeNumbersSample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num = 98;
		int half=num/2;
		int count = 0;
		
	//	for (int i = 2; i <=half; i++) {
			if (num% 2 ==0) {
				
				count = 1;
			//	break;
				
			}
	//	}
		
		if (count==0) {
			System.out.println("Prime Numbers");
			
		}
		
		else {
			System.out.println("Not a Prime Numbers");
		}	
	}
}

package org.login.deva;

import java.util.Scanner;

public class ClassScanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int a =s.nextInt();
		System.out.println("employee id:"+a);
		
		System.out.println("Enter Emplyee Name");
		String string = s.next();
		System.out.println("Emplyee Name:"+string);
		
		System.out.println("emp phone no");
		long l = s.nextLong();
		System.out.println("emp phone no:"+l);
		
		System.out.println("Emp salary");
		float f = s.nextFloat();
		System.out.println("Emp salary:"+f);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

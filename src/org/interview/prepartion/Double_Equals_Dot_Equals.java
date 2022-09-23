package org.interview.prepartion;

public class Double_Equals_Dot_Equals {

	public static void main(String[] args) {
		
		String s = "ab";
		String s1= "ab";
		
		System.out.println(s==s1);//reason is literal is same memory location
		
		System.out.println(s.equals(s1));
		
		String s2 = new String ("ab");
		String s3 = new String ("ab");
		
		System.out.println(s2==s3);
		
	System.out.println(s2.equals(s3));

	}

}

package org.interview.prepartion;

public class FormOfMatrix {

	public static void main(String[] args) {
		
		int a [][] = new int [3][3];
		
		int k=1;
		
		//assign value
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				
				a[i][j]=k;
				k++;
			}}

		//print value
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.print(a[i][j] +" ");
			}
			
			System.out.println();
		}
	}

}

package org.interview.prepartion;

public class MatrixPrograme1 {

	public static void main(String[] args) {
		
		int a[][] = new int [3][3];
		
		//assign value
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				if (i==j) {
					a[i][j]=1;
				}
				else {
					a[i][j]=0;
				}}}
		
		// print value
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print(a[i][j]+ " ");	
			}
			
			System.out.println();
		}
	}

}

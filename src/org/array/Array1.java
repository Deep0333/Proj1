package org.array;

public class Array1 {
	public static void main(String[] args) {
		// write a java program to calculate 
		//the average value of array element
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			
		}
		
		double average = sum / a.length;
		
		System.out.println("Average Value  - "+average);
		
		
	}

}

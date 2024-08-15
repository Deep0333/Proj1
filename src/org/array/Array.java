package org.array;

public class Array {
	public static void main(String[] args) {
		
		//Write a java program to sum value of an array
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}

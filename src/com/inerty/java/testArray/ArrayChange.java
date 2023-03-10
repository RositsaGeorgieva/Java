package com.inerty.java.testArray;

public class ArrayChange {


	public static void main(String[] args) {
		int[] myArray = {5, 7, 10, 15, 22, 8, 3};
		
		int tmp = 0;
		System.out.println("The original array is: ");
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		for (int j = 0; j < myArray.length/2; j++) {
				
			tmp = myArray[j];
			myArray[j] = myArray[myArray.length - j - 1];
			myArray[myArray.length - j - 1] = tmp;
			
		}
		
		
		System.out.println("Changed array is: ");
		
		for (int k = 0; k < myArray.length; k++) {
			System.out.println(myArray[k]);
		}
	
	}
}

package com.inerty.java.designpatterns;

public class SingletonDoubleCheckTest {

	public static void main(String[] args) {
		
		SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
		
		System.out.println("Singleton instance is: " +  instance);
		
		System.out.println("Singleton instance is: " +  instance);
		
		System.out.println("Singleton instance is: " +  instance);

	}

}

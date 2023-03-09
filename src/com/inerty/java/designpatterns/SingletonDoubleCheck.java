package com.inerty.java.designpatterns;

public class SingletonDoubleCheck {

	private volatile static SingletonDoubleCheck instance;
	  
	public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck .class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

}

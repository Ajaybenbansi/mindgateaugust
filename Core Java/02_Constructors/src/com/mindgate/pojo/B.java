package com.mindgate.pojo;

public class B extends A {

	public B() {
		
	System.out.println("Default counstructor of B");
	}

	public B(int x) {
		super(x);
	System.out.println("overloaded constructor of B");
	}
	
}

package com.garg.java8.lambdas.basics;

public class Test {

	public static void main(String[] args) {
//		A a = new C();
//		a.MyMethod();
		
		A a = ()->System.out.println("Inside MyMethod");
		a.MyMethod();
	}

}

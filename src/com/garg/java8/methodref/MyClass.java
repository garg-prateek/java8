package com.garg.java8.methodref;

public class MyClass {
	
	public void myMethod1(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		MyInterface f = i->System.out.println(i);
		f.myMethod(10);
		
		MyClass c = new MyClass();
		MyInterface f1=c::myMethod1;
		f1.myMethod(20);
	}

}

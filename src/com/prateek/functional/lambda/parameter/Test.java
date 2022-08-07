package com.prateek.functional.lambda.parameter;

public class Test {

	public static void main(String[] args) {

		Sum sum = (x, y) -> System.out.println(x + y);
		sum.add(10, 100);
	}

}

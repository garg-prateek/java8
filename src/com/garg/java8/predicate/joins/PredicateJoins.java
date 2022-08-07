package com.garg.java8.predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		int[] x = { 0, 7, 20, 30, 40, 50, 60, 70, 73 };

		Predicate<Integer> p1 = i -> (i > 10);

		Predicate<Integer> p2 = j -> (j % 2 == 0);
		System.out.println("Greater than 10: ");
		method1(p1, x);
		method1(p2, x);

		System.out.println("Not > 10: ");
		// Predicate<Integer> negate = p1.negate();
		method1(p1.negate(), x);

		System.out.println("Graeter than 10 and odd");
		method1(p2.negate().and(p1), x);
		
		System.out.println("Greater than 10 or even");
		method1(p1.or(p2),x);
	}

	static void method1(Predicate<Integer> p, int[] s) {
		for (int value : s) {
			if (p.test(value)) {
				System.out.println(value);
			}
		}

	}

}

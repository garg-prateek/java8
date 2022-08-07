package com.garg.java8.lambdas.intrfaces;

public class Test {

	public static void main(String[] args) throws Exception {

//		Runnable r = new MyRunnableImpl();
//		Thread t = new Thread(r);
//		t.start();

		Runnable r = () -> {

			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
	}

}


//here is the doubt

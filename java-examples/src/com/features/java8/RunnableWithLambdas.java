package com.features.java8;

public class RunnableWithLambdas {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable running with run()");
				System.out.println("Lot of Boilerplate code");
			}
		});
		thread.run();
		thread = new Thread(()->{
			System.out.println("Suck my boilerplate haha");
		});
		thread.run();
	}
}

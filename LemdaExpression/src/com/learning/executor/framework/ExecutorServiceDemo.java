package com.learning.executor.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		System.out.println("main thread starts");		
		
		executorServiceDemo();
		
		System.out.println("main thread ends");
	}

	private static void executorServiceDemo() {
		ExecutorService ex = Executors.newSingleThreadExecutor();		
		Runnable r = () -> 
		{
			System.out.println("Executing Task!!");
		};
		
		ex.execute(r);	
		ex.shutdown();
	}

}

package com.learning.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.learning.java8.model.Song;

public class LamdaUsingRunnable {

	public static void main(String[] args) {
		
		Runnable r =() ->	
		{
			System.out.println("Inside Thread "+ Thread.currentThread().getName());
			System.out.println("task getting executed!!!");	
		};
		 Thread t = new Thread(r);
		 t.start();
	}
}

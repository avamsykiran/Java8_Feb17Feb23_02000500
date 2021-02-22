package com.cts.gcd.service;

public class Swapper<T> {

	public void swap(T e1,T e2) {
		System.out.println(e1 + "\t" + e2);
	
		T t = e2;
		e2 = e1;
		e1 = t;
		
		System.out.println(e1 + "\t" + e2);
	}
}

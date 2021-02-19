package com.cts.ed.ui;

import java.util.Scanner;

public class UncheckedExceptionHandling {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number> ");
		while(!scan.hasNextInt()) {
			System.out.println("Expecting an integer");
			scan.next();
		}
		int n1=scan.nextInt();
		System.out.print("Number> ");
		while(!scan.hasNextInt()) {
			System.out.println("Expecting an integer");
			scan.next();
		}
		int n2=scan.nextInt();
		
		if(n2!=0) {
			System.out.println(n1/n2);
		}
		System.out.println("Program Terminated");
	}

}

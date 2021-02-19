package com.cts.ed.ui;

import java.util.Scanner;

import com.cts.ed.exception.InsufficientBalanceException;
import com.cts.ed.exception.InvalidAmountException;
import com.cts.ed.model.BankAccount;
import com.cts.ed.service.BankingOperations;

public class BankingApp {

	public static void main(String[] args) {
		
		BankingOperations bo = new BankingOperations();
		
		BankAccount acc = new BankAccount("SB0001", 15000.0);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Deposite Amount> ");
		double amount = scan.nextDouble();
		
		try {
			bo.deposite(acc, amount);
			System.out.println("Bal after deposite " + acc.getCurrentBal());
		} catch (InvalidAmountException exp) {
			System.err.println(exp.getMessage());
		}	
		
		System.out.print("Withdraw Amount> ");
		double amountToWithdraw = scan.nextDouble();
//		
//		try {
//			bo.withdraw(acc, amountToWithdraw);
//			System.out.println("Bal after withdraw " + acc.getCurrentBal());
//		} catch (InvalidAmountException exp) {
//			System.err.println(exp.getMessage());
//		} catch (InsufficientBalanceException exp) {
//			System.err.println(exp.getMessage());
//		}	


		try {
			bo.withdraw(acc, amountToWithdraw);
			System.out.println("Bal after withdraw " + acc.getCurrentBal());
		} catch (InvalidAmountException | InsufficientBalanceException exp) {
			System.err.println(exp.getMessage());
		}	

		
	}

}

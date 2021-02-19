package com.cts.ed.service;

import com.cts.ed.exception.InsufficientBalanceException;
import com.cts.ed.exception.InvalidAmountException;
import com.cts.ed.model.BankAccount;

public class BankingOperations {

	public void deposite(BankAccount acc,double amount) throws InvalidAmountException {	
		
		if(amount<=0) {
			throw new InvalidAmountException("Amount to be deposited can not be negative");
		}
		
		acc.setCurrentBal(acc.getCurrentBal()+amount);
	}
	
	public void withdraw(BankAccount acc,double amount) throws InvalidAmountException, InsufficientBalanceException {	
		
		if(amount<=0) {
			throw new InvalidAmountException("Amount to be withdrawn can not be negative");
		}
		
		if(amount>=acc.getCurrentBal()) {
			throw new InsufficientBalanceException("Can not withdraw "+amount + "from a bal of "+acc.getCurrentBal());
		}
		
		acc.setCurrentBal(acc.getCurrentBal()-amount);
	}
}

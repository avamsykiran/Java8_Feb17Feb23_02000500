package com.cts.ed.exception;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException(String errMsg) {
		super(errMsg);
	}

}

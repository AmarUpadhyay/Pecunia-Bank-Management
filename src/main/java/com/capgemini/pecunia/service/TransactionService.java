package com.capgemini.pecunia.service;


import com.capgemini.pecunia.entity.Cheque;


public interface TransactionService {

	public String creditUsingSlip(long accountId,double amount);

	public String creditUsingCheque(Cheque cheque);

	public String debitUsingSlip(long accountId, double amount);
	
	public String debitUsingCheque(Cheque cheque);
}

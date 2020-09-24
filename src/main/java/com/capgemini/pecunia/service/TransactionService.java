package com.capgemini.pecunia.service;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Cheque;

public interface TransactionService {

	public Account creditUsingSlip(String accountId,double amount) ;

	public String creditUsingCheque(Cheque cheque, double amount);

	public boolean debitUsingSlip(String accountId, double amount);
}

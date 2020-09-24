package com.capgemini.pecunia.service;

import com.capgemini.pecunia.entity.Account;

public interface TransactionService {

	public Account creditUsingSlip(String accountId,double amount) ;
}

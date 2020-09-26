package com.capgemini.pecunia.service;


import java.util.List;

import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.exception.TransactionDoesNotExist;

public interface PassbookService {
	List<Transaction> accountSummary(long accountId,String startDate, String endDate) throws TransactionDoesNotExist ;
	boolean accountValidation(long accountId);
	List<Transaction> updatePassbook(long accountId) throws TransactionDoesNotExist;
	
	void  updatelastUpdated(long accountId);

}

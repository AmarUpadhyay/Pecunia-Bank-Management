package com.capgemini.pecunia.service;

import java.util.Date;
import java.util.List;

import com.capgemini.pecunia.entity.Transaction;

public interface PassbookService {
	List<Transaction> accountSummary(long accountId,Date startDate, Date endDate);
	boolean accountValidation(long accountId);
	List<Transaction> updatePassbook(long accountId);
	
	void  updatelastUpdated(long accountId);

}

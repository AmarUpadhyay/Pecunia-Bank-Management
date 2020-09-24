package com.capgemini.pecunia.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.capgemini.pecunia.entity.Transaction;

public interface PassbookService {
	List<Transaction> accountSummary(String accountId,LocalDate startDate, LocalDate endDate);
	boolean accountValidation(String accountId);
	List<Transaction> updatePassbook(String accountId);
	
	void  updatelastUpdated(String accountId);

}

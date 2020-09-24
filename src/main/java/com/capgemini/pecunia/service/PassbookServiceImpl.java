package com.capgemini.pecunia.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.PassbookDao;
import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Transaction;

@Service
public class PassbookServiceImpl implements PassbookService {

	@Autowired
	private PassbookDao dao;
	Account account=new Account();
	long millis=System.currentTimeMillis();  
	Date date=new Date(millis); 

	@Override
	public List<Transaction> accountSummary(String accountId, LocalDate startDate, LocalDate endDate) {
		System.out.println(dao.accountSummary(accountId, startDate, endDate).toString());
		return null;// dao.accountSummary(accountId, startDate, endDate);
	}
	//Implementation of Account validation method. 
	@Override
	public boolean accountValidation(String accountId) {
		 account=dao.get(accountId);
		if(account==null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public List<Transaction> updatePassbook(String accountId){
		List<Transaction> result=dao.updatePassbook(accountId);
		updatelastUpdated(accountId);
		return result;	
		
	}

	@Override
	public void updatelastUpdated(String accountId) {
		 dao.update(accountId,date);
	}


	
}
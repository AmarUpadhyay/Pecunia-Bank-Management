package com.capgemini.pecunia.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.repository.PassbookRepository;

@Service
public class PassbookServiceImpl implements IPassbookService {

	@Autowired
	private PassbookRepository dao;
	Account account=new Account();
	long millis=System.currentTimeMillis();  
	Date date=new Date(millis); 

	@Override
	public List<Transaction> accountSummary(long accountId, Date startDate,Date endDate) {
		System.out.println(dao.accountSummary(accountId, startDate, endDate).toString());
		return null;
	}
	//Implementation of Account validation method. 
	@Override
	public boolean accountValidation(long accountId) {
		 account=dao.get(accountId);
		if(account==null) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public List<Transaction> updatePassbook(long accountId){
		List<Transaction> result=dao.updatePassbook(accountId);
		updatelastUpdated(accountId);
		return result;	
		
	}

	
	@Override
	public void updatelastUpdated(long accountId) {
		 dao.update(accountId,date);
		
	}


	
}
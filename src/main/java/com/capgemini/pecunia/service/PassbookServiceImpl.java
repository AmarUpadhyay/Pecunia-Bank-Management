package com.capgemini.pecunia.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.exception.AccountDoesNotExistException;
import com.capgemini.pecunia.exception.TransactionDoesNotExist;
import com.capgemini.pecunia.repository.PassbookRepository;

@Service
public class PassbookServiceImpl implements PassbookService {

	@Autowired
	private PassbookRepository dao;
	Account account=new Account();
	long millis=System.currentTimeMillis();  
	Date date=new Date(millis); 

	@Override
	public List<Transaction> accountSummary(long accountId, String startDate,String endDate) throws TransactionDoesNotExist {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date start;
		try {
			start = format.parse(startDate);
		
		System.out.println(start);
		Date end = format.parse(endDate);
		List<Transaction> result = dao.accountSummary(accountId, start, end);
		if((result.isEmpty())){
			throw new TransactionDoesNotExist();
		}
		return dao.accountSummary(accountId, start, end);
		} catch (ParseException e) {
			e.printStackTrace();
		}
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
	public List<Transaction> updatePassbook(long accountId) throws TransactionDoesNotExist{
		if(accountValidation(accountId)==false)
		{
			throw new AccountDoesNotExistException();
		}
		List<Transaction> result=dao.updatePassbook(accountId);
		if(result.isEmpty()) {
			throw new TransactionDoesNotExist();
		}
		updatelastUpdated(accountId);
		return result;	
		
	}

	
	@Override
	public void updatelastUpdated(long accountId) {
		 dao.update(accountId,date);
		
	}


	
}
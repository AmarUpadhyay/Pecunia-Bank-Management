package com.capgemini.pecunia.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Cheque;
import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.repository.AccountDao;
import com.capgemini.pecunia.repository.ChequeDao;
import com.capgemini.pecunia.repository.TransactionDao;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private ChequeDao chequeDao;
	
	@Autowired
	private TransactionDao transactionDao;
	
	@Override
	public String creditUsingSlip(long accountNumber, double amount) {
		Account account=new Account();
		Transaction transaction=new Transaction();
		account=accountDao.getOne(accountNumber);
		account.setAccountBalance(amount+account.getAccountBalance());
		System.out.println(account);
		accountDao.save(account);
		transaction.setAccount(account);
		transaction.setTransAmount(amount);
		transaction.setTransType("Slip");
		transactionDao.save(transaction);
		return "Success";
	}

	@Override
	public String creditUsingCheque(Cheque cheque) {
		String transactionStatus="";
		Transaction transaction=new Transaction();
		Account account=new Account();
		double balance=accountDao.getOne(cheque.getChequeAccountNumber()).getAccountBalance();
		account=accountDao.getOne(cheque.getChequeAccountNumber());

		if(balance<cheque.getChequeAmount())
		{
			 transactionStatus="Failed";
			 cheque.setChequeStatus("Reject");
			 chequeDao.save(cheque);
		}
		else {
			balance-=cheque.getChequeAmount();
			account.setAccountBalance(balance);
			accountDao.save(account);
			transaction.setAccount(account);
			transaction.setChequeNumber(cheque.getChequeNumber());
			transaction.setTransAmount(cheque.getChequeAmount());
			transaction.setTransType("Cheque");
			transactionDao.save(transaction);
			cheque.setChequeStatus("Accepted");
			chequeDao.save(cheque);
			transactionStatus="Success";
		}
		return transactionStatus;
	}

	@Override
	public String debitUsingSlip(long accountNumber, double amount) {
		Account account=new Account();
		Transaction transaction=new Transaction();
		String transactionStatus="";
		account=accountDao.getOne(accountNumber);
		if(account.getAccountBalance()<amount)
			transactionStatus="Failed";
		else
		{
			account.setAccountBalance(account.getAccountBalance()-amount);
			accountDao.save(account);
			transaction.setAccount(account);
			transaction.setTransAmount(amount);
			transaction.setTransType("Slip");
			transactionDao.save(transaction);
			transactionStatus="Success";
		}
		return transactionStatus;
	}

	@Override
	public String debitUsingCheque(Cheque cheque) {
		String transactionStatus="";
		Transaction transaction=new Transaction();
		Account account=new Account();
		double balance=accountDao.getOne(cheque.getChequeAccountNumber()).getAccountBalance();
		account=accountDao.getOne(cheque.getChequeAccountNumber());
		if(balance<cheque.getChequeAmount())
		{
			 transactionStatus="Failed";
			 cheque.setChequeStatus("Rejected");
			 chequeDao.save(cheque);
		}	 
			 
		else
		{
			balance-=cheque.getChequeAmount();
			account.setAccountBalance(balance);
			accountDao.save(account);
			transaction.setAccount(account);
			transaction.setChequeNumber(cheque.getChequeNumber());
			transaction.setTransAmount(cheque.getChequeAmount());
			transaction.setTransType("Cheque");
			transactionDao.save(transaction);
			cheque.setChequeStatus("Accepted");
			chequeDao.save(cheque);
			transactionStatus="Success";
		}
		return transactionStatus;
	}
		
	}

	


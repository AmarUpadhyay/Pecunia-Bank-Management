package com.capgemini.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.pecunia.dao.AccountsDAO;
import com.capgemini.pecunia.dao.ChequeDAO;
import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Cheque;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private AccountsDAO accountsDao;
	@Autowired
	private ChequeDAO chequeDao; 
	
	@Override
	public Account creditUsingSlip(String accountId, double amount) {
		Account account=new Account();
		account=accountsDao.getOne(accountId);
		account.setAccountBalance(amount+account.getAccountBalance());
		System.out.println(account);
		return account;
	}

	@Override
	public String creditUsingCheque(Cheque cheque, double amount) {
		String accountNumber=cheque.getChequeAccountNumber();
		String chequeStatus="Credited";
		double balance=accountsDao.getOne(accountNumber).getAccountBalance();
		if(balance<amount)
			 chequeStatus="Bounce";	
		return chequeStatus;
	}

	@Override
	public boolean debitUsingSlip(String accountId, double amount) {
		Account account=new Account();
		boolean transactionStatus=false;
		account=accountsDao.getOne(accountId);
		if(account.getAccountBalance()<amount)
			transactionStatus=false;
		else
		{
			account.setAccountBalance(account.getAccountBalance()-amount);
			transactionStatus=true;
		}
		return transactionStatus;
	}
	
}

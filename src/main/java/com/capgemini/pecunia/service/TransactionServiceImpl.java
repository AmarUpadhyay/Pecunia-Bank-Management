package com.capgemini.pecunia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.pecunia.dao.AccountsDAO;
import com.capgemini.pecunia.entity.Account;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private AccountsDAO accountsDao;
	
	@Override
	public Account creditUsingSlip(String accountId, double amount) {
		Account account=new Account();
		account=accountsDao.getOne(accountId);
		account.setAccountBalance(amount+account.getAccountBalance());
		System.out.println(account);
		accountsDao.save(account);
		return account;
	}
	
}

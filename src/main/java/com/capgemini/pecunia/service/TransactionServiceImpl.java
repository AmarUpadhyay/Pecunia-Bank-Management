package com.capgemini.pecunia.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Cheque;
import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.repository.AccountRepository;
import com.capgemini.pecunia.repository.ChequeRepository;
import com.capgemini.pecunia.repository.TransactionRepository;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private ChequeRepository chequeRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public String creditUsingSlip(long accountNumber, double amount) {
		Account account=new Account();
		Transaction transaction=new Transaction();
		account=accountRepository.getOne(accountNumber);
		account.setAccountBalance(amount+account.getAccountBalance());
		System.out.println(account);
		accountRepository.save(account);
		transaction.setAccount(account);
		transaction.setTransAmount(amount);
		transaction.setTransType("Slip");
		transactionRepository.save(transaction);
		return "Success";
	}

	@Override
	public String creditUsingCheque(Cheque cheque) {
		String transactionStatus="";
		Transaction transaction=new Transaction();
		Account account=new Account();
		double balance=accountRepository.getOne(cheque.getChequeAccountNumber()).getAccountBalance();
		account=accountRepository.getOne(cheque.getChequeAccountNumber());

		if(balance<cheque.getChequeAmount())
		{
			 transactionStatus="Failed";
			 cheque.setChequeStatus("Reject");
			 chequeRepository.save(cheque);
		}
		else {
			balance-=cheque.getChequeAmount();
			account.setAccountBalance(balance);
			accountRepository.save(account);
			transaction.setAccount(account);
			transaction.setChequeNumber(cheque.getChequeNumber());
			transaction.setTransAmount(cheque.getChequeAmount());
			transaction.setTransType("Cheque");
			transactionRepository.save(transaction);
			cheque.setChequeStatus("Accepted");
			chequeRepository.save(cheque);
			transactionStatus="Success";
		}
		return transactionStatus;
	}

	@Override
	public String debitUsingSlip(long accountNumber, double amount) {
		Account account=new Account();
		Transaction transaction=new Transaction();
		String transactionStatus="";
		account=accountRepository.getOne(accountNumber);
		if(account.getAccountBalance()<amount)
			transactionStatus="Failed";
		else
		{
			account.setAccountBalance(account.getAccountBalance()-amount);
			accountRepository.save(account);
			transaction.setAccount(account);
			transaction.setTransAmount(amount);
			transaction.setTransType("Slip");
			transactionRepository.save(transaction);
			transactionStatus="Success";
		}
		return transactionStatus;
	}

	@Override
	public String debitUsingCheque(Cheque cheque) {
		String transactionStatus="";
		Transaction transaction=new Transaction();
		Account account=new Account();
		double balance=accountRepository.getOne(cheque.getChequeAccountNumber()).getAccountBalance();
		account=accountRepository.getOne(cheque.getChequeAccountNumber());
		if(balance<cheque.getChequeAmount())
		{
			 transactionStatus="Failed";
			 cheque.setChequeStatus("Rejected");
			 chequeRepository.save(cheque);
		}	 
			 
		else
		{
			balance-=cheque.getChequeAmount();
			account.setAccountBalance(balance);
			accountRepository.save(account);
			transaction.setAccount(account);
			transaction.setChequeNumber(cheque.getChequeNumber());
			transaction.setTransAmount(cheque.getChequeAmount());
			transaction.setTransType("Cheque");
			transactionRepository.save(transaction);
			cheque.setChequeStatus("Accepted");
			chequeRepository.save(cheque);
			transactionStatus="Success";
		}
		return transactionStatus;
	}
		
	}

	


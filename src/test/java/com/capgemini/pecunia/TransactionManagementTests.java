package com.capgemini.pecunia;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Cheque;
import com.capgemini.pecunia.exception.AccountDoesNotExistException;
import com.capgemini.pecunia.repository.AccountRepository;
import com.capgemini.pecunia.service.TransactionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionManagementTests {
	
	@Autowired
	private TransactionService transactionService;
	

	@MockBean
	private AccountRepository accountRepository;
	
	private Account account;
	 private Cheque cheque;
	 
	 Date date1=new Date(8302020);
	
	@Test
	public void creditUsingSlipTest() throws AccountDoesNotExistException{
	    account=new Account(1000120,null ,"Savings", "Active", 42000.00, date1, null);
		when(accountRepository.getOne(1000120L)).thenReturn(account);
		when(accountRepository.existsById(1000120L)).thenReturn(true);
		assertEquals("Success",transactionService.creditUsingSlip(1000120, 2000.00));
	}
	
	@Test
	public void creditUsingChequeTest() throws AccountDoesNotExistException {
		cheque=new Cheque(10000123, "1000101", 1000120, "Amar",
				"HDFC", "HDFC00661", LocalDate.of(2020, 9, 23) , null,44000.00);
		when(accountRepository.getOne(1000120L)).thenReturn(new Account(1000120,null ,"Savings", "Active", 40000.00, date1, null));
		when(accountRepository.existsById(1000120L)).thenReturn(true);
		assertEquals("Failed",transactionService.creditUsingCheque(cheque));
	}
	
	@Test
	public void debitUsingSlipWithInsufficientBalanceTest() throws AccountDoesNotExistException {
		account=new Account(1000120,null ,"Savings", "Active", 42000.00, date1, null);
		when(accountRepository.getOne(1000120L)).thenReturn(new Account(1000120,null ,"Savings", "Active", 40000.00, date1, null));
		when(accountRepository.existsById(1000120L)).thenReturn(true);
		assertEquals("Failed",transactionService.debitUsingSlip(1000120, 41000.00));
	}
	@Test
	public void debitUsingSlipWithSufficientBalanceTest() throws AccountDoesNotExistException {
		account=new Account(1000120,null ,"Savings", "Active", 42000.00, date1, null);
		when(accountRepository.getOne(1000120L)).thenReturn(new Account(1000120,null ,"Savings", "Active", 40000.00, date1, null));
		when(accountRepository.existsById(1000120L)).thenReturn(true);

		assertEquals("Success",transactionService.debitUsingSlip(1000120, 1000.00));
	}
	
}

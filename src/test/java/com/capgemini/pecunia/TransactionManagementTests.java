package com.capgemini.pecunia;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Cheque;
import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.repository.AccountRepository;
import com.capgemini.pecunia.repository.TransactionRepository;
import com.capgemini.pecunia.service.TransactionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionManagementTests {
	@Autowired
	private TransactionService transactionService;
	
	@MockBean
	private TransactionRepository transactionRepository;
	
	@MockBean
	private AccountRepository accountRepository;
	
	 private Account account;
	
	 private Cheque cheque;

	
	@Test
	public void creditUsingSlipTest() {
		account=new Account(100111,null ,"Savings", "Active", 42000.00, LocalDate.of(2020, 8, 30), null);
		when(accountRepository.getOne(100111L)).thenReturn(new Account(100111,null ,"Savings", "Active", 40000.00, LocalDate.of(2020, 8, 30), null));
		assertEquals("Success",transactionService.creditUsingSlip(100111, 2000.00));
	}
	
	@Test
	public void creditUsingChequeTest() {
		cheque=new Cheque(10000123, "1000101", 100111, "Amar",
				"HDFC", "HDFC00661", LocalDate.of(2020, 9, 23) , null,44000.00);
		when(accountRepository.getOne(100111L)).thenReturn(new Account(100111,null ,"Savings", "Active", 40000.00, LocalDate.of(2020, 8, 30), null));
		assertEquals("Failed",transactionService.creditUsingCheque(cheque));
	}
	
	@Test
	public void debitUsingSlipWithInsufficientBalanceTest() {
		account=new Account(100111,null ,"Savings", "Active", 42000.00, LocalDate.of(2020, 8, 30), null);
		when(accountRepository.getOne(100111L)).thenReturn(new Account(100111,null ,"Savings", "Active", 40000.00, LocalDate.of(2020, 8, 30), null));
		assertEquals("Failed",transactionService.debitUsingSlip(100111, 41000.00));
	}
	@Test
	public void debitUsingSlipWithSufficientBalanceTest() {
		account=new Account(100111,null ,"Savings", "Active", 42000.00, LocalDate.of(2020, 8, 30), null);
		when(accountRepository.getOne(100111L)).thenReturn(new Account(100111,null ,"Savings", "Active", 40000.00, LocalDate.of(2020, 8, 30), null));
		assertEquals("Success",transactionService.debitUsingSlip(100111, 1000.00));
	}
	
}

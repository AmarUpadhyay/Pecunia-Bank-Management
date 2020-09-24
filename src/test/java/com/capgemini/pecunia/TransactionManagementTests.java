package com.capgemini.pecunia;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.pecunia.dao.AccountsDAO;
import com.capgemini.pecunia.dao.TransactionDAO;
import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Cheque;
import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.service.TransactionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionManagementTests {
	@Autowired
	private TransactionService transactionService;
	
	@MockBean
	private TransactionDAO transactionDao;
	
	@MockBean
	private AccountsDAO accountsDao;
	
	private Account account;
	 private Transaction transaction1;
	 private Cheque cheque;
	
	@BeforeEach                           
     void setUp() {                                                                                      
		// account1=new Account("HDFC100111","Amar", "111", "Savings",
		//		"Active", 42000.00, LocalDate.of(2020, 8, 30));
		 transaction1=new Transaction("1000101", "slip", 2000.00, LocalDate.of(2020, 9, 24), null,
				null, "HDFC100111", null);
    }
	
	@Test
	public void creditUsingSlipTest() {
		account=new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 40000.00, LocalDate.of(2020, 8, 30));
		when(accountsDao.getOne("HDFC100111")).thenReturn(new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 40000.00, LocalDate.of(2020, 8, 30)));
		assertEquals(account,transactionService.creditUsingSlip("HDFC100111", 2000.00));
	}
	
	@Test
	public void creditUsingChequeTest() {
		cheque=new Cheque("HDFCCH001", 1000101, "HDFC100111", "Amar",
				"HDFC", "HDFC00661", LocalDate.of(2020, 9, 23) , null);
		when(accountsDao.getOne("HDFC100111")).thenReturn(new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 40000.00, LocalDate.of(2020, 8, 30)));
		assertEquals("Bounce",transactionService.creditUsingCheque(cheque, 44000.00));
	}
	
	@Test
	public void debitUsingSlipWithInsufficientBalanceTest() {
		account=new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 42000.00, LocalDate.of(2020, 8, 30));
		when(accountsDao.getOne("HDFC100111")).thenReturn(new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 40000.00, LocalDate.of(2020, 8, 30)));
		assertEquals(false,transactionService.debitUsingSlip("HDFC100111", 41000.00));
	}
	@Test
	public void debitUsingSlipWithSufficientBalanceTest() {
		account=new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 42000.00, LocalDate.of(2020, 8, 30));
		when(accountsDao.getOne("HDFC100111")).thenReturn(new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 40000.00, LocalDate.of(2020, 8, 30)));
		assertEquals(true,transactionService.debitUsingSlip("HDFC100111", 1000.00));
	}
	
}

package com.capgemini.pecunia;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;


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
				"Active", 42000.00, LocalDate.of(2020, 8, 30));
		when(accountsDao.getOne("HDFC100111")).thenReturn(new Account("HDFC100111","Amar", "111", "Savings",
				"Active", 40000.00, LocalDate.of(2020, 8, 30)));
		assertEquals(account,transactionService.creditUsingSlip("HDFC100111", 2000.00));
	}
	
}

package com.capgemini.pecunia.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.Transaction;

@Repository 
public interface PassbookDao extends JpaRepository<Account, String> {
	
	
	@Query("select t from Transaction t where account_Id=?1 and t.transDate>=?2 and t.transDate<=?3")
	List<Transaction> accountSummary(String accountId, LocalDate startDate,LocalDate endDate);
	
	@Query("select u from Account u where account_Id=?1")
	Account get(String accountId);
	
	@Query("select t from Transaction t where account_Id=?1 and t.transDate>(select u.lastUpdated from Account u where account_Id=?1) ")
	List<Transaction> updatePassbook(String accountId);

	@Modifying
	@Query("update Account set lastUpdated=?2 where  account_Id=?1")
	void update(String accountId, Date date);

	

}

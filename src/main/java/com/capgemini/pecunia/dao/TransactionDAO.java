package com.capgemini.pecunia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.pecunia.entity.Transaction;

public interface TransactionDAO extends JpaRepository<Transaction,String>{

}

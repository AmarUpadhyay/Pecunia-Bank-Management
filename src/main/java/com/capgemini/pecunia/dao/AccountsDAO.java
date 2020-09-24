package com.capgemini.pecunia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.Account;
@Repository
public interface AccountsDAO extends JpaRepository<Account,String> {

}

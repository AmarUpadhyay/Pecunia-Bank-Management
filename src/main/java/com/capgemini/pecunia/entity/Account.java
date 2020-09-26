package com.capgemini.pecunia.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name="Account")
public class Account {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seq")
	@SequenceGenerator(name="seq",initialValue=100001001,allocationSize=100)
	@Column(length=12)
	private long accountNumber;
	
	@OneToOne
	private Branch branch;
	
	@Column(length=15)
	private String accountType;
	
	private String accountStatus;
	
	@Column(length=8)
	private double accountBalance;
	
	@CreatedDate
	private LocalDate lastUpdated;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="custId",nullable=false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Customer customer;

	
	public long getAccountNumber() {
		return accountNumber;
	}

	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	
	public String getAccountType() {
		return accountType;
	}

	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	
	public String getAccountStatus() {
		return accountStatus;
	}

	
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	
	public double getAccountBalance() {
		return accountBalance;
	}

	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	
	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(long accountNumber, Branch branch, String accountType, String accountStatus, double accountBalance,
			LocalDate lastUpdated, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.branch = branch;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.lastUpdated = lastUpdated;
		this.customer = customer;
	}

	public Account() {
		super();
	}
	

}
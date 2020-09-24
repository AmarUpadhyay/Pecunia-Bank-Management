package com.capgemini.pecunia.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
	@Id  
	@Column(length=12)
	private String accountNumber;
	private String customerId;
	@Column(length=15)
	private String accountBranchId;
	@Column(length=15)
	private String accountType;
	private String accountStatus;
	@Column(length=8)
	private double accountBalance;
	@Column(length = 20)
	private LocalDate lastUpdated;
	

	public Account(String accountNumber, String customerId, String accountBranchId, String accountType,
			String accountStatus, double accountBalance, LocalDate lastUpdated) {
		super();
		this.accountNumber = accountNumber;
		this.customerId = customerId;
		this.accountBranchId = accountBranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.lastUpdated = lastUpdated;
	}


	public String getaccountNumber() {
		return accountNumber;
	}


	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getcustomerId() {
		return customerId;
	}


	public void setcustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getAccountBranchId() {
		return accountBranchId;
	}


	public void setAccountBranchId(String accountBranchId) {
		this.accountBranchId = accountBranchId;
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


	public Account() {
		super();
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerId=" + customerId + ", accountBranchId="
				+ accountBranchId + ", accountType=" + accountType + ", accountStatus=" + accountStatus
				+ ", accountBalance=" + accountBalance + ", lastUpdated=" + lastUpdated + "]";
	}
	
}

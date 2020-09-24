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
	private String accountId;
	private String accountHolderId;
	@Column(length=15)
	private String accountBranchId;
	@Column(length=15)
	private String accountType;
	private String accountStatus;
	@Column(length=8)
	private double accountBalance;
	@Column(length = 20)
	private LocalDate lastUpdated;
	

	public Account(String accountId, String accountHolderId, String accountBranchId, String accountType,
			String accountStatus, double accountBalance, LocalDate lastUpdated) {
		super();
		this.accountId = accountId;
		this.accountHolderId = accountHolderId;
		this.accountBranchId = accountBranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.lastUpdated = lastUpdated;
	}


	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public String getAccountHolderId() {
		return accountHolderId;
	}


	public void setAccountHolderId(String accountHolderId) {
		this.accountHolderId = accountHolderId;
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
		return "Account [accountId=" + accountId + ", accountHolderId=" + accountHolderId + ", accountBranchId="
				+ accountBranchId + ", accountType=" + accountType + ", accountStatus=" + accountStatus
				+ ", accountBalance=" + accountBalance + ", lastUpdated=" + lastUpdated + "]";
	}
	
}

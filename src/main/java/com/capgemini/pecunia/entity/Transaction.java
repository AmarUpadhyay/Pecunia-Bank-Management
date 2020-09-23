package com.capgemini.pecunia.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction") 
public class Transaction {
	@Id
	@Column(length=8)
	private String transId;
	@Column(length=8)
	private String transType;
	@Column(length=8)
	private Double transAmount;
	@Column(length = 20)
	private LocalDate transDate;
	@Column(length=12)
	private String transFrom;
	@Column(length=12)
	private String transTo;
	@Column(length = 12)
	private String accountId;
	@Column(length=6)
	private String chequeNumber;
	
	
	public Transaction(String string, String transType, Double transAmount, LocalDate transDate, String transFrom,
			String transTo, String accountId, String chequeNumber) {
		super();
		this.transId = string;
		this.transType = transType;
		this.transAmount = transAmount;
		this.transDate = transDate;
		this.transFrom = transFrom;
		this.transTo = transTo;
		this.accountId = accountId;
		this.chequeNumber = chequeNumber;
	}




	//getters and setters

	public String getChequeNumber() {
		return chequeNumber;
	}




	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	
	
	public String getTransId() {
		return transId;
	}




	public void setTransId(String transId) {
		this.transId = transId;
	}




	public String getTransType() {
		return transType;
	}




	public void setTransType(String transType) {
		this.transType = transType;
	}




	public Double getTransAmount() {
		return transAmount;
	}




	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}




	public LocalDate getTransDate() {
		return transDate;
	}




	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}




	public String getTransFrom() {
		return transFrom;
	}




	public void setTransFrom(String transFrom) {
		this.transFrom = transFrom;
	}




	public String getTransTo() {
		return transTo;
	}




	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}




	public String getAccountId() {
		return accountId;
	}




	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}




	public Transaction() {
		super();
	}
	
	
	
}

package com.capgemini.pecunia.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {
	@Id
	@Column(length = 8)
	private String transId;
	@Column(length = 8)
	private String transType;
	@Column(length = 8)
	private Double transAmount;
	@Column(length = 20)
	private LocalDate transDate;
	@Column(length = 12)
	private String accountNumber;
	@Column(length = 6)
	private String chequeNumber;

	public Transaction(String transId, String transType, Double transAmount, LocalDate transDate, String accountNumber, String chequeNumber) {
		super();
		this.transId = transId;
		this.transType = transType;
		this.transAmount = transAmount;
		this.transDate = transDate;
		this.accountNumber = accountNumber;
		this.chequeNumber = chequeNumber;
	}

	// getters and setters

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

	public String getaccountNumber() {
		return accountNumber;
	}

	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Transaction() {
		super();
	}

}

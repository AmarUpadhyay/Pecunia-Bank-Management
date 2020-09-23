package com.capgemini.pecunia.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction") 
public class Transaction {
	@Id
	@Column(length=8)
	private int transId;
	/**
	 * @return the transId
	 */
	public int getTransId() {
		return transId;
	}


	/**
	 * @param transId the transId to set
	 */
	public void setTransId(int transId) {
		this.transId = transId;
	}


	/**
	 * @return the transType
	 */
	public String getTransType() {
		return transType;
	}


	/**
	 * @param transType the transType to set
	 */
	public void setTransType(String transType) {
		this.transType = transType;
	}


	/**
	 * @return the transAmount
	 */
	public Double getTransAmount() {
		return transAmount;
	}


	/**
	 * @param transAmount the transAmount to set
	 */
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}


	/**
	 * @return the transDate
	 */
	public Date getTransDate() {
		return transDate;
	}


	/**
	 * @param transDate the transDate to set
	 */
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}


	/**
	 * @return the transFrom
	 */
	public String getTransFrom() {
		return transFrom;
	}


	/**
	 * @param transFrom the transFrom to set
	 */
	public void setTransFrom(String transFrom) {
		this.transFrom = transFrom;
	}


	/**
	 * @return the transTo
	 */
	public String getTransTo() {
		return transTo;
	}


	/**
	 * @param transTo the transTo to set
	 */
	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}


	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}


	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	@Column(length=8)
	private String transType;
	@Column(length=8)
	private Double transAmount;
	@Column(length = 20)
	private Date transDate;
	@Column(length=12)
	private String transFrom;
	@Column(length=12)
	private String transTo;
	@Column(length = 12)
	private String accountId;
	
	
	//getters and setters

	
	public Transaction() {
		super();
	}
	
	
	
}

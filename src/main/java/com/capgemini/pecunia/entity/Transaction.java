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

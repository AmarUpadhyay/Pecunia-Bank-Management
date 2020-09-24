package com.capgemini.pecunia.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoanDisbursed") 
public class LoanDisbursed {

	@Id
	@Column(length = 12)
	private String loanRequestId;
	@Column(length=12)
	private String loanCustomerId;
	private double loanAmount;
	private String loanType;
	private int loanTenure;
	private double loanEMI;
	private double loanAmtPaid;
	private LocalDate loanDueDate;
	
	public LoanDisbursed(String loanRequestId, String loanCustomerId, double loanAmount, String loanType,
			int loanTenure, double loanEMI, double loanAmtPaid, LocalDate loanDueDate) {
		super();
		this.loanRequestId = loanRequestId;
		this.loanCustomerId = loanCustomerId;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loanTenure = loanTenure;
		this.loanEMI = loanEMI;
		this.loanAmtPaid = loanAmtPaid;
		this.loanDueDate = loanDueDate;
	}
	
	public LoanDisbursed() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getLoanRequestId() {
		return loanRequestId;
	}
	public void setLoanRequestId(String loanRequestId) {
		this.loanRequestId = loanRequestId;
	}
	public String getLoanCustomerId() {
		return loanCustomerId;
	}
	public void setLoanCustomerId(String loanCustomerId) {
		this.loanCustomerId = loanCustomerId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public double getLoanEMI() {
		return loanEMI;
	}
	public void setLoanEMI(double loanEMI) {
		this.loanEMI = loanEMI;
	}
	public double getLoanAmtPaid() {
		return loanAmtPaid;
	}
	public void setLoanAmtPaid(double loanAmtPaid) {
		this.loanAmtPaid = loanAmtPaid;
	}
	public LocalDate getLoanDueDate() {
		return loanDueDate;
	}
	public void setLoanDueDate(LocalDate loanDueDate) {
		this.loanDueDate = loanDueDate;
	}
	
	
	
}

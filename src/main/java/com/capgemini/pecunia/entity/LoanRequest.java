package com.capgemini.pecunia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LoanRequest") 
public class LoanRequest {
	
	@Id
	@Column(length = 12)
	private String loanRequestId;
	@Column(length=12)
	private String loanCustomerId;
	private double loanAmount;
	private String loanType;
	private int loanTenure;
	private double loanRoi;
	private int creditScore;
	private double loanEMI;
	
	public LoanRequest(String loanRequestId, String loanCustomerId, double loanAmount, String loanType, int loanTenure,
			double loanRoi, int creditScore, double loanEMI) {
		super();
		this.loanRequestId = loanRequestId;
		this.loanCustomerId = loanCustomerId;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.loanTenure = loanTenure;
		this.loanRoi = loanRoi;
		this.creditScore = creditScore;
		this.loanEMI = loanEMI;
	}

	public LoanRequest() {
		super();
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

	public double getLoanRoi() {
		return loanRoi;
	}

	public void setLoanRoi(double loanRoi) {
		this.loanRoi = loanRoi;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public double getLoanEMI() {
		return loanEMI;
	}

	public void setLoanEMI(double loanEMI) {
		this.loanEMI = loanEMI;
	}
	
}

package com.capgemini.pecunia.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="Cheque")
public class Cheque {
	@Id
	@Column(length=12)
	private String chequeId;
	@Column(length=12)
	private long chequeNumber;
	@Column(length=12)
	private String chequeAccountNumber;
	private String chequeHolderName;
	private String chequeBankName;
	private String chequeIfsc;
	private LocalDate chequeIssueDate;
	private String chequeStatus;
	private Double chequeAmount;
	/**
	 * @return the chequeId
	 */
	public String getChequeId() {
		return chequeId;
	}
	/**
	 * @param chequeId the chequeId to set
	 */
	public void setChequeId(String chequeId) {
		this.chequeId = chequeId;
	}
	/**
	 * @return the chequeNumber
	 */
	public long getChequeNumber() {
		return chequeNumber;
	}
	/**
	 * @param chequeNumber the chequeNumber to set
	 */
	public void setChequeNumber(long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	/**
	 * @return the chequeAccountNumber
	 */
	public String getChequeAccountNumber() {
		return chequeAccountNumber;
	}
	/**
	 * @param chequeAccountNumber the chequeAccountNumber to set
	 */
	public void setChequeAccountNumber(String chequeAccountNumber) {
		this.chequeAccountNumber = chequeAccountNumber;
	}
	/**
	 * @return the chequeHolderName
	 */
	public String getChequeHolderName() {
		return chequeHolderName;
	}
	/**
	 * @param chequeHolderName the chequeHolderName to set
	 */
	public void setChequeHolderName(String chequeHolderName) {
		this.chequeHolderName = chequeHolderName;
	}
	/**
	 * @return the chequeBankName
	 */
	public String getChequeBankName() {
		return chequeBankName;
	}
	/**
	 * @param chequeBankName the chequeBankName to set
	 */
	public void setChequeBankName(String chequeBankName) {
		this.chequeBankName = chequeBankName;
	}
	/**
	 * @return the chequeIfsc
	 */
	public String getChequeIfsc() {
		return chequeIfsc;
	}
	/**
	 * @param chequeIfsc the chequeIfsc to set
	 */
	public void setChequeIfsc(String chequeIfsc) {
		this.chequeIfsc = chequeIfsc;
	}
	/**
	 * @return the chequeIssueDate
	 */
	public LocalDate getChequeIssueDate() {
		return chequeIssueDate;
	}
	/**
	 * @param chequeIssueDate the chequeIssueDate to set
	 */
	public void setChequeIssueDate(LocalDate chequeIssueDate) {
		this.chequeIssueDate = chequeIssueDate;
	}
	/**
	 * @return the chequeStatus
	 */
	public String getChequeStatus() {
		return chequeStatus;
	}
	/**
	 * @param chequeStatus the chequeStatus to set
	 */
	public void setChequeStatus(String chequeStatus) {
		this.chequeStatus = chequeStatus;
	}
	public Cheque(String chequeId, long chequeNumber, String chequeAccountNumber, String chequeHolderName,
			String chequeBankName, String chequeIfsc, LocalDate chequeIssueDate, String chequeStatus) {
		super();
		this.chequeId = chequeId;
		this.chequeNumber = chequeNumber;
		this.chequeAccountNumber = chequeAccountNumber;
		this.chequeHolderName = chequeHolderName;
		this.chequeBankName = chequeBankName;
		this.chequeIfsc = chequeIfsc;
		this.chequeIssueDate = chequeIssueDate;
		this.chequeStatus = chequeStatus;
	}
	public Cheque() {
		super();
	}
	
	
}

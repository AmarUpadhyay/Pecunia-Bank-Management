package com.capgemini.pecunia.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer") 
public class Customer {
	@Id	
	@Column(length=12)
	private String custId;
	private String custName;
	private String custAddress;
	@Column(length=12)
	private String custAadhar;
	@Column(length=12)
	private String custPan;
	@Column(length=10)
	private String custContact;
	private LocalDate custDob;
	private String custEmail;

	public Customer() {
		super();
	}

	public Customer(String custId, String custName, String custAddress, String custAadhar, String custPan,
			String custContact, LocalDate custDob, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custAadhar = custAadhar;
		this.custPan = custPan;
		this.custContact = custContact;
		this.custDob = custDob;
		this.custEmail = custEmail;
	}
	
	/**
	 * @return the custDob
	 */
	public LocalDate getCustDob() {
		return custDob;
	}
	/**
	 * @param custDob the custDob to set
	 */
	public void setCustDob(LocalDate custDob) {
		this.custDob = custDob;
	}
	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the custAddress
	 */
	public String getCustAddress() {
		return custAddress;
	}
	/**
	 * @param custAddress the custAddress to set
	 */
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	/**
	 * @return the custAadhar
	 */
	public String getCustAadhar() {
		return custAadhar;
	}
	/**
	 * @param custAadhar the custAadhar to set
	 */
	public void setCustAadhar(String custAadhar) {
		this.custAadhar = custAadhar;
	}
	/**
	 * @return the custPan
	 */
	public String getCustPan() {
		return custPan;
	}
	/**
	 * @param custPan the custPan to set
	 */
	public void setCustPan(String custPan) {
		this.custPan = custPan;
	}
	/**
	 * @return the custContact
	 */
	public String getCustContact() {
		return custContact;
	}
	/**
	 * @param custContact the custContact to set
	 */
	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}
	/**
	 * @return the custEmail
	 */
	public String getCustEmail() {
		return custEmail;
	}
	/**
	 * @param custEmail the custEmail to set
	 */
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
}

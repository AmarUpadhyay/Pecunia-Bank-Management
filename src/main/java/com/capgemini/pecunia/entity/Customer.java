package com.capgemini.pecunia.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seq")
	@SequenceGenerator(name="seq",initialValue=10000101,allocationSize=100)
	private long custId;
	private String custName;
	private String custAddress;
	private String custAadhar;
	private String custPan;
	private String custContact;
	private Date custDob;
	public Customer() {
		super();
	}
	/**
	 * @return the custDob
	 */
	public Date getCustDob() {
		return custDob;
	}
	/**
	 * @param custDob the custDob to set
	 */
	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}
	private String custEmail;
	/**
	 * @return the custId
	 */
	public long getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(long custId) {
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

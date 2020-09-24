package com.capgemini.pecunia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Branch") 
public class Branch {
	@Id
	@Column(length=4)
	private String branchId;
	private String branchName;
	@Column(length=12)
	private String branchAddressId;
	private String branchIfsc;
	/**
	 * @return the branchId
	 */
	public String getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	/**
	 * @return the branchAddressId
	 */
	public String getBranchAddressId() {
		return branchAddressId;
	}
	/**
	 * @param branchAddressId the branchAddressId to set
	 */
	public void setBranchAddressId(String branchAddressId) {
		this.branchAddressId = branchAddressId;
	}
	/**
	 * @return the branchIfsc
	 */
	public String getBranchIfsc() {
		return branchIfsc;
	}
	/**
	 * @param branchIfsc the branchIfsc to set
	 */
	public void setBranchIfsc(String branchIfsc) {
		this.branchIfsc = branchIfsc;
	}
	public Branch() {
		super();
	}
	
}

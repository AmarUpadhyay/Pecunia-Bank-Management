package com.capgemini.pecunia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Branch") 
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seq")
	@SequenceGenerator(name="seq",initialValue=111,allocationSize=100)
	@Column(length=4)
	private long branchId;
	private String branchName;
	@Column(length=12)
	private String branchAddressId;
	private String branchIfsc;
	/**
	 * @return the branchId
	 */
	public long getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(long branchId) {
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
	public Branch(long branchId, String branchName, String branchAddressId, String branchIfsc) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddressId = branchAddressId;
		this.branchIfsc = branchIfsc;
	}
	
}
package com.capgemini.pecunia.entity;

public class Branch {
	private String branchId;
	private String branchName;
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

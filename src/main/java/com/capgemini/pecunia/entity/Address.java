  
package com.capgemini.pecunia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="Address") 
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="seq")
	@SequenceGenerator(name="seq",initialValue=101,allocationSize=100)
	@Column(length=12)
	private long addressId;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private String addressCity;
	private String addressState;
	private String addressCountry;
	@Column(length=6)
	private int addressZipcode;
	
	
	public long getAddressId() {
		return addressId;
	}
	
	public Address(long addressId, String addressLine1, String addressLine2, String addressLine3, String addressCity,
			String addressState, String addressCountry, int addressZipcode) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressZipcode = addressZipcode;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}
	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	/**
	 * @return the addressCity
	 */
	public String getAddressCity() {
		return addressCity;
	}
	/**
	 * @param addressCity the addressCity to set
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	/**
	 * @return the addressState
	 */
	public String getAddressState() {
		return addressState;
	}
	/**
	 * @param addressState the addressState to set
	 */
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	/**
	 * @return the addressCountry
	 */
	public String getAddressCountry() {
		return addressCountry;
	}
	/**
	 * @param addressCountry the addressCountry to set
	 */
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	/**
	 * @return the addressZipcode
	 */
	public int getAddressZipcode() {
		return addressZipcode;
	}
	/**
	 * @param addressZipcode the addressZipcode to set
	 */
	public void setAddressZipcode(int addressZipcode) {
		this.addressZipcode = addressZipcode;
	}
	public Address() {
		super();
	}
	
	
	
}


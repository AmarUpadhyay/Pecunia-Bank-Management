package com.capgemini.pecunia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Employee") 
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@SequenceGenerator(name="seq",initialValue=100001,allocationSize=100)
	@Column(length=12)
    private long empId;
	
	private String empName;
	private String empEmail;
	private String empPassword;
	private String empDesignation;
		 
	@OneToOne
    private Branch branch;

	
	public long getEmpId() {
		return empId;
	}

	
	public void setEmpId(long empId) {
		this.empId = empId;
	}

	
	public String getEmpName() {
		return empName;
	}

	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public String getEmpEmail() {
		return empEmail;
	}

	
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	
	public String getEmpPassword() {
		return empPassword;
	}

	
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	
	public String getEmpDesignation() {
		return empDesignation;
	}

	
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	
	public Branch getBranch() {
		return branch;
	}

	
	public Employee() {
		super();
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Employee(long empId, String empName, String empEmail, String empPassword, String empDesignation,
			Branch branch) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPassword = empPassword;
		this.empDesignation = empDesignation;
		this.branch = branch;
	}
		
		
		 
}

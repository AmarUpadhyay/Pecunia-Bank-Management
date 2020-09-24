package com.capgemini.pecunia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee") 
public class Employee {
	@Id
	@Column(length=12)
		 private String empId;
		 private String empName;
		 private String empEmail;
		 private String empPassword;
		 private String empDesignation;
		 private String empBranchId;
		/**
		 * @return the empId
		 */
		public String getEmpId() {
			return empId;
		}
		/**
		 * @param empId the empId to set
		 */
		public void setEmpId(String empId) {
			this.empId = empId;
		}
		/**
		 * @return the empName
		 */
		public String getEmpName() {
			return empName;
		}
		/**
		 * @param empName the empName to set
		 */
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		/**
		 * @return the empEmail
		 */
		public String getEmpEmail() {
			return empEmail;
		}
		/**
		 * @param empEmail the empEmail to set
		 */
		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}
		/**
		 * @return the empPassword
		 */
		public String getEmpPassword() {
			return empPassword;
		}
		/**
		 * @param empPassword the empPassword to set
		 */
		public void setEmpPassword(String empPassword) {
			this.empPassword = empPassword;
		}
		/**
		 * @return the empDesignation
		 */
		public String getEmpDesignation() {
			return empDesignation;
		}
		/**
		 * @param empDesignation the empDesignation to set
		 */
		public void setEmpDesignation(String empDesignation) {
			this.empDesignation = empDesignation;
		}
		/**
		 * @return the empBranchId
		 */
		public String getEmpBranchId() {
			return empBranchId;
		}
		/**
		 * @param empBranchId the empBranchId to set
		 */
		public void setEmpBranchId(String empBranchId) {
			this.empBranchId = empBranchId;
		}
		public Employee() {
			super();
		}
		
		 
}

package com.capgemini.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Employee;
import com.capgemini.pecunia.service.LoginServiceImpl;

@RestController
public class LoginController {

	@Autowired
	private LoginServiceImpl service;

	@PostMapping("/login")
	public Employee loginUser(@RequestBody Employee employee) throws Exception{
		String tempEmailId = employee.getEmpEmail();
		String tempPassword = employee.getEmpPassword();
		Employee eObj = null;
		if (tempEmailId != null && tempPassword != null) {
			eObj = service.fetchEmployeeByEmailIDAndPassword(tempEmailId, tempPassword);
		}
		if(eObj == null) {
			throw new Exception("No Such User");
		}
		return eObj;
	}

	@PostMapping("/registeruser")
	public Employee registerUser(@RequestBody Employee employee) throws Exception {
		String tempEmailId = employee.getEmpEmail();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			Employee obj = service.fetchEmployeeByEmailID(tempEmailId);
			if (obj != null) {
				throw new Exception("user with email " + tempEmailId + " is already exixts");
			}
		}
		Employee eObj = null;
		eObj = service.saveDetails(employee);
		return eObj;
	}

}

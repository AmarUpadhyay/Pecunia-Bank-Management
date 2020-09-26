package com.capgemini.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Cheque;
import com.capgemini.pecunia.exception.AccountDoesNotExistException;
import com.capgemini.pecunia.service.TransactionService;

@RestController
@RequestMapping(value="/api/transaction")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@PutMapping("creditUsingSlip/{accountNumber}/{amount}")
	public String creditUsingSlip(@PathVariable("accountNumber") long accountNumber,@PathVariable("amount")double amount) throws AccountDoesNotExistException {
		return transactionService.creditUsingSlip(accountNumber, amount);
	}
	
	@PutMapping("creditUsingCheque")
	public String creditUsingCheque(@RequestBody Cheque cheque) throws AccountDoesNotExistException{
		return transactionService.creditUsingCheque(cheque);
	}
	
	@PutMapping("debitUsingSlip/{accountNumber}/{amount}")
	public String debitUsingSlip(@PathVariable("accountNumber") long accountNumber,@PathVariable("amount")double amount) throws AccountDoesNotExistException {
		return transactionService.debitUsingSlip(accountNumber, amount);
	}
	
	@PutMapping("debitUsingCheque")
	public String debitUsingCheque(@RequestBody Cheque cheque) throws AccountDoesNotExistException {
		return transactionService.debitUsingCheque(cheque);
	}
}

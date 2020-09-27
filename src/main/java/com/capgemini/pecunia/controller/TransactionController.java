package com.capgemini.pecunia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Cheque;
import com.capgemini.pecunia.exception.AccountDoesNotExistException;
import com.capgemini.pecunia.exception.TransactionDoesNotExist;
import com.capgemini.pecunia.service.TransactionService;
/**
 * 
 * @author Amar
 *
 */
@RestController
@RequestMapping(value="/api/transaction")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	/**
	 * API that returns the status of the transaction
	 * i.e. success or failed.
	 * 
	 * @param accountNumber
	 * @param amount
	 * @return
	 * @throws TransactionDoesNotExist
	 */
	
	@PutMapping("creditUsingSlip/{accountNumber}/{amount}")
	public String creditUsingSlip(@PathVariable("accountNumber") long accountNumber,@PathVariable("amount")double amount) throws AccountDoesNotExistException {
		return transactionService.creditUsingSlip(accountNumber, amount);
	}
	
	/**
	 * API that returns the status of the transaction 
	 * i.e. success if sufficient amount available in payer account or failed.
	 * 
	 * @param cheque
	 * @return
	 * @throws AccountDoesNotExistException
	 */
	@PutMapping("creditUsingCheque")
	public String creditUsingCheque(@RequestBody Cheque cheque) throws AccountDoesNotExistException{
		return transactionService.creditUsingCheque(cheque);
	}
	
	/**
	 * API that returns the status of the transaction
	 *i.e. success if sufficient balance available in customer's account or failed.
	 * 
	 * @param accountNumber
	 * @param amount
	 * @return
	 * @throws TransactionDoesNotExist
	 */
	@PutMapping("debitUsingSlip/{accountNumber}/{amount}")
	public String debitUsingSlip(@PathVariable("accountNumber") long accountNumber,@PathVariable("amount")double amount) throws AccountDoesNotExistException {
		return transactionService.debitUsingSlip(accountNumber, amount);
	}
	
	/**
	 * API that returns the status of the transaction 
	 * i.e. success if sufficient amount available in payer account or failed.
	 * 
	 * @param cheque
	 * @return
	 * @throws AccountDoesNotExistException
	 */
	@PutMapping("debitUsingCheque")
	public String debitUsingCheque(@RequestBody Cheque cheque) throws AccountDoesNotExistException {
		return transactionService.debitUsingCheque(cheque);
	}
}

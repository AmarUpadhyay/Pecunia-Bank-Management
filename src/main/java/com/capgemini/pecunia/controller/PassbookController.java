package com.capgemini.pecunia.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.service.IPassbookService;

@RestController
@RequestMapping("/bank")
public class PassbookController {

	@Autowired
	private IPassbookService service;

	
	@GetMapping("/accountSummary/{accountId}/{startDate}/{endDate}")
	public ResponseEntity<List<Transaction>> accountSummary(@PathVariable long accountId, @PathVariable Date startDate, @PathVariable Date endDate) 
	{
		List<Transaction> list = service.accountSummary(accountId, startDate, endDate);
		return new ResponseEntity<>(list, HttpStatus.OK);
		}
		
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Please enter Valid details")
	
	@ExceptionHandler({Exception.class})
	public void handleException() {
		
	}
	
	//Validating accountId whether is is present or not.
	@GetMapping("/accountValidation/{accountId}")
	public boolean accountValidation(@PathVariable("accountId") long accountId) {
		return service.accountValidation(accountId);
	}

	//Fetching the transactions till last updated date
		@GetMapping("/updatePassbook/{accountId}")
		public  ResponseEntity<List<Transaction>> updatePassbook(@PathVariable("accountId") long accountId)
		{
				List<Transaction> list = service.updatePassbook(accountId);
				return new ResponseEntity<>(list, HttpStatus.OK);
			}
			
}



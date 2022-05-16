package com.springboot.Assignment3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Assignment3.entity.Customer;
import com.springboot.Assignment3.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	@PostMapping("/deposit/{accountNo}")
	public Customer depositAmmout(@RequestParam(value="Customer") double ammount,@PathVariable int accountNo) 
	{
		return this.transactionService.depositAmmout(accountNo,ammount);
	}
	@PostMapping("/withdraw/{accountNo}")
	public Customer withdrawAmmout(@RequestBody double ammount,@PathVariable int accountNo) 
	{
		return this.transactionService.withdrawAmmount(accountNo,ammount);
	}
	@GetMapping("/balace/{accountNo}")
	public double checkBalance(@PathVariable int accountNo)
	{
		return this.transactionService.checkBalance(accountNo);
	}
}

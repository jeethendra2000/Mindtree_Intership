package com.springboot.Assignment3.service;

import com.springboot.Assignment3.entity.Customer;

public interface TransactionService {
	public Customer depositAmmout(int accountNo,double ammount);
	public Customer withdrawAmmount(int accountNo,double ammount);
	public double checkBalance(int accountNo);
}

package com.springboot.Assignment3.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Assignment3.entity.Customer;
import com.springboot.Assignment3.repository.CustomerRepository;
import com.springboot.Assignment3.service.CustomerService;
import com.springboot.Assignment3.service.TransactionService;
@Service
public class TransactionSereviceImpl implements TransactionService {
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer depositAmmout(int accoutNo, double ammount) {
		Customer customer=customerRepository.findByAccountNo(accoutNo);
		double balance=customer.getBalance();
		balance+=ammount;
		customer.setBalance(balance);
		return customer;
	}

	@Override
	public Customer withdrawAmmount(int accountNo, double ammount) {
		Customer customer=customerRepository.findByAccountNo(accountNo);
		double balance=customer.getBalance();
		balance-=ammount;
		if(balance<0)
			balance=0;
		customer.setBalance(balance);
		return customer;
	}

	@Override
	public double checkBalance(int accountNo) {
		return customerRepository.findByAccountNo(accountNo).getBalance();
	}

}

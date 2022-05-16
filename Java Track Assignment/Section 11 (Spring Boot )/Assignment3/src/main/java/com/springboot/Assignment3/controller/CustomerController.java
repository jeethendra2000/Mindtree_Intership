package com.springboot.Assignment3.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Assignment3.entity.Customer;
import com.springboot.Assignment3.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return this.customerService.getCustomers();
	}
	@GetMapping("/customers/{name}")
	public Customer getCustomer(@PathVariable String name)
	{
		return this.customerService.getCustomer(name);
	}
	@GetMapping("/customer/{accountNo}")
	public Customer getCustomer(@PathVariable int accountNo)
	{
		return this.customerService.getCustomer(accountNo);
	}
	@DeleteMapping("/customer/{accountNo}")
	public Customer deleteCustomer(int accountNo)
	{
		return this.customerService.deleteCustomer(accountNo);
	}
	@PostMapping("customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return this.customerService.addCustomer(customer);
	}
}

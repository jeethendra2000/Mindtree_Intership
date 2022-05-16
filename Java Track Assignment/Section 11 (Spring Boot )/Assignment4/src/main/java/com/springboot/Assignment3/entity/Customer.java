package com.springboot.Assignment3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customer {
	@Id
	private int accountNo;
	private String name;
	private String accountType;
	private double balance;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int accountNo, String name, String accountType, double balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.accountType = accountType;
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

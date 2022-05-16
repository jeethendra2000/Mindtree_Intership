package com.assignment2.serviceimpl;

import org.springframework.stereotype.Service;

import com.assignment2.service.Arithmetic;
@Service
public class ArithmeticImpl implements Arithmetic {

	@Override
	public double simpleInterest(int principle, int no, float rate) {
		return (principle*no*rate)/100;
	}

}

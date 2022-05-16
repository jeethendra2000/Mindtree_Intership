package com.assignment2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment2.entity.ArithmeticModel;
import com.assignment2.service.Arithmetic;

@RestController
public class ArithmeticController {
	@Autowired
	private Arithmetic arithmetic;
	@PostMapping("/simpleInterest")
	public Double simpleInterest(@RequestBody ArithmeticModel arithmeticModel)
	{
		return this.arithmetic.simpleInterest(arithmeticModel.getPrinciple(),arithmeticModel.getNo(),arithmeticModel.getRate());
	}
}

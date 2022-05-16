package com.assignment2.entity;

public class ArithmeticModel {
	private int principle;
	private int no;
	private float rate;
	public ArithmeticModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArithmeticModel(int principle, int no, float rate) {
		super();
		this.principle = principle;
		this.no = no;
		this.rate = rate;
	}
	public int getPrinciple() {
		return principle;
	}
	public void setPrinciple(int principle) {
		this.principle = principle;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
}

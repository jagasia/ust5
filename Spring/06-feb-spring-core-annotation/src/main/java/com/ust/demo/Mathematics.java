package com.ust.demo;

import org.springframework.stereotype.Component;

@Component("maths")
public class Mathematics {
	private Integer no1;
	private Integer no2;
	
	public Mathematics() {
		this.no1 = 2;
		this.no2 = 3;
	}

	public Mathematics(Integer no1, Integer no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}

	public Integer getNo1() {
		return no1;
	}

	public void setNo1(Integer no1) {
		this.no1 = no1;
	}

	public Integer getNo2() {
		return no2;
	}

	public void setNo2(Integer no2) {
		this.no2 = no2;
	}
	
	public int sum()
	{
		return no1+no2;
	}
}

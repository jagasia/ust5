package com.ust.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MathematicsService {
	public int sum(int no1, int no2)
	{
		return no1+no2+100;
	}
}

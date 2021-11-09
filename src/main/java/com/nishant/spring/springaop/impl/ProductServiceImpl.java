package com.nishant.spring.springaop.impl;

import com.nishant.spring.springaop.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		return num1*num2;
	}

}

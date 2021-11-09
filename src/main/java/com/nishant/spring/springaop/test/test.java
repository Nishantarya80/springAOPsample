package com.nishant.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nishant.spring.springaop.ProductService;

public class test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/nishant/spring/springaop/test/config.xml");
		ProductService productService = (ProductService) applicationContext.getBean("productService");
		System.out.println(productService.multiply(2, 5));

	}

}

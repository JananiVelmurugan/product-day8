package com.fsd.productday8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.productday8.model.Product;
import com.fsd.productday8.service.ProductServiceImpl;

@RestController
public class ProductController {

//	private ProductServiceImpl service = new ProductServiceImpl();
	@Autowired
	private ProductServiceImpl service;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Boot";
	}

	@GetMapping("/products")
	public List<Product> findAll() {
		return service.displayAll();
	}

	@GetMapping("/products/{id}")
	public Product findById(@PathVariable int id) throws Exception {
		return service.display(id);
	}

	@PostMapping("/products/insert")
	public void addProduct(@RequestBody Product product) {
		service.add(product);
	}

}

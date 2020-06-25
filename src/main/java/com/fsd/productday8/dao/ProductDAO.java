package com.fsd.productday8.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fsd.productday8.model.Product;


public interface ProductDAO {

	void insert(Product product);

	Product view(int id);

	List<Product> viewAll();

}

package com.fsd.productday8.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fsd.productday8.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	static List<Product> products;

	public ProductDAOImpl() {
		products = new ArrayList<Product>();
		Product product1 = new Product(101, "Laptop");
		Product product2 = new Product(102, "Mobile");
		products.add(product1);
		products.add(product2);
	}

	@Override
	public void insert(Product product) {
		products.add(product);
	}

	@Override
	public Product view(int id) {
		for (Product product : products) {
			if (id == product.getId()) {
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> viewAll() {
		return products;
	}

}

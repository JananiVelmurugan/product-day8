package com.fsd.productday8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.productday8.dao.ProductDAO;
import com.fsd.productday8.model.Product;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductDAO productDAO;

//	public ProductServiceImpl() {
//		productDAO = new ProductDAOImpl();
//	}

	public void add(Product product) {
		productDAO.insert(product);
	}

	public Product display(int id) {
		return productDAO.view(id);
	}

	public List<Product> displayAll() {
		return productDAO.viewAll();
	}

}

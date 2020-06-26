package com.fsd.productday8.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.productday8.model.Product;
import com.fsd.productday8.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	// @Autowired
//	private ProductDAO productDAO;

	@Autowired
	private ProductRepository repository;

//	public ProductServiceImpl() {
//		productDAO = new ProductDAOImpl();
//	}

	public void add(Product product) {
//		dao.insert(product);
		repository.save(product);
	}

	public Product display(int id) {
//		return dao.findById(id);
		Optional<Product> result = repository.findById(id);
		Product product = result.get();
		return product;
	}

	public List<Product> displayAll() {
//		return dao.viewAll();
		return repository.findAll();
	}

}

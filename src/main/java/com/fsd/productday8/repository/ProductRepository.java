package com.fsd.productday8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsd.productday8.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

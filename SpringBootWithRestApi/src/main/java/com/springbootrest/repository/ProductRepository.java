package com.springbootrest.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootrest.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}

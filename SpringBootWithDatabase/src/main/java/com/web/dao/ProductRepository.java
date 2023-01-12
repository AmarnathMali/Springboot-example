package com.web.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}

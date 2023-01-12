package com.springbootrest.service;

import java.util.List;

import com.springbootrest.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product getProductById(int pid);

	public Product insert(Product product);

	public void updateProduct(int id,Product product);
	
	public void deleteProduct(int pid);
	

}

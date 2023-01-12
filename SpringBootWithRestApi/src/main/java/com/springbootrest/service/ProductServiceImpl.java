package com.springbootrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.model.Product;
import com.springbootrest.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
    
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return productRepository.findById(pid).get();
	}

	@Override
	public Product insert(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		Product p = productRepository.findById(id).get();
		p.setPname(product.getPname());
		p.setPrice(product.getPrice());
		productRepository.save(p);
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		productRepository.deleteById(pid);
		
	}
	
}

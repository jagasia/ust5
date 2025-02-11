package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Product;
import com.ust.demo.exception.ProductNotFoundException;
import com.ust.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product create(Product product) {
		return pr.save(product);
	}
	public List<Product> read() {
		return pr.findAll();
	}
	public Product read(Integer id) throws ProductNotFoundException {
		Optional<Product> temp = pr.findById(id);
		Product product=null;
		if(temp.isPresent())
			product=temp.get();
		else
			throw new ProductNotFoundException("No product found for given id:"+id);
		return product;
	}
	public Product update(Product product) throws ProductNotFoundException {
		Product temp = read(product.getId());
		return pr.save(product);
	}
	public Product delete(Integer id) throws ProductNotFoundException {
		Product temp = read(id);
		pr.delete(temp);
		return temp;
	}
	
	public List<String> getCategories()
	{
		return pr.retrieveDistinctCategories();
	}
	
	public List<Product> findByCategory(String category) {
		return  pr.findByCategory(category);
	}
}

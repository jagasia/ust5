package com.ust.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{

	@Query("select distinct p.category from Product p")
	public List<String> retrieveDistinctCategories();
	
	List<Product> findByCategory(String category);
}

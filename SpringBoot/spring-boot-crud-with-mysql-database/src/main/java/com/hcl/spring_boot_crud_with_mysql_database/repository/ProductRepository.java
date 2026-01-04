package com.hcl.spring_boot_crud_with_mysql_database.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hcl.spring_boot_crud_with_mysql_database.entity.Product;

import jakarta.transaction.Transactional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByPriceLessThan(double price);
	
	@Query("Select p from Product p where p.color=?1")
	List<Product> getProductByColor(String color);
	
	
	@Query("Delete from Product p where p.color=?1")
	@Transactional
	@Modifying
	void deleteProductByColor(String color);
	

}

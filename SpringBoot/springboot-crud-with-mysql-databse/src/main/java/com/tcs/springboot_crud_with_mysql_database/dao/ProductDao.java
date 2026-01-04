package com.tcs.springboot_crud_with_mysql_database.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import com.tcs.springboot_crud_with_mysql_database.entity.Product;
import com.tcs.springboot_crud_with_mysql_database.repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	private ProductRepository productRepository;

	// Insert Product into database
	public Product saveProductDao(Product product) {
		return productRepository.saveAndFlush(product);
	}

	// Get Product by id
	public Product getProductByIdDao(int productId) {

		Optional<Product> optional = productRepository.findById(productId);

		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	// Get all Product
	public List<Product> getAllProductDao() {
		return productRepository.findAll();
	}

	// Save Multiple Products
	public List<Product> saveMultipleProductsDao(List<Product> products) {
		return productRepository.saveAllAndFlush(products);
	}

	// Update Product
	public Product updateProductDao(Product product) {

		Product existingProduct = getProductByIdDao(product.getId());

		if (existingProduct == null) {
			return null;
		}

		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setColor(product.getColor());
		existingProduct.setMfd(product.getMfd());
		existingProduct.setExpd(product.getExpd());

		return productRepository.save(existingProduct);
	}

	public boolean deleteProductByIdDao(int productId) {

		Product product = getProductByIdDao(productId);

		if (product != null) {
			productRepository.delete(product);
			return true;
		}
		return false;
	}

	// Search Product By color
	public List<Product> getProductByColorDao(String color) {
		return productRepository.findByColor(color);
	}

	// Search Products By Name
	public List<Product> getProductByNameDao(String name) {
		return productRepository.findByName(name);
	}

	// sort Product by price
	public List<Product> getAllProductsSortedByPrice() {
		return productRepository.findAllByOrderByPriceAsc();
	}

	// sort Product By Date
	public List<Product> getAllProductsSortByMfd() {
		return productRepository.findAllByOrderByMfdAsc();

	}
	
	//Pagination
	public Page<Product> paginationProductDao(int pageNumber){
		return productRepository.findAll(PageRequest.of(pageNumber, 3));
	}

}

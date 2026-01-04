package com.hcl.spring_boot_crud_with_mysql_database.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Repository;

import com.hcl.spring_boot_crud_with_mysql_database.entity.Product;
import com.hcl.spring_boot_crud_with_mysql_database.repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProductDao(Product product) {
		
		return productRepository.saveAndFlush(product);
	}
	
	public Product getProductByIdDao(int productId) {
		
		Optional<Product> optional=productRepository.findById(productId);
		
		if(optional.isPresent()) {
			
			return optional.get();
			
		}
		
		return null;
	}
	
	public List<Product> getAllProductDao(){
		return productRepository.findAll();
	}
	
	public List<Product> saveMultipleProductDao(List<Product> products){
		
		return productRepository.saveAllAndFlush(products);
	}
	
	public boolean deleteProductByIdDao(int productId) {
	
		Product product=getProductByIdDao(productId);
		
		if(product!=null) {
			
			productRepository.delete(product);
			
			return true;
		}
		
		return false;
	}
	
	public Product updateProductDao(Product product) {
		Product product2=getProductByIdDao(product.getId());
		if (product2 == null) {
			return null;
		}
		product2.setName(product.getName());
		product2.setPrice(product.getPrice());
		product2.setColor(product.getColor());
		product2.setExpd(product.getExpd());
		product2.setMfd(product.getMfd());
		
		return productRepository.saveAndFlush(product2);
	}
	
	
	public List<Product> findByPriceDao(double price) {
		return productRepository.findByPriceLessThan(price);
	}
	
	public List<Product> sortProductByAttributeAscDao(String attributeName){
		return productRepository.findAll(Sort.by(Order.desc(attributeName)));
	}
	
	public Page<Product> paginationProductDao(int pageNumber){
		return productRepository.findAll(PageRequest.of(pageNumber, 3));
	}
}
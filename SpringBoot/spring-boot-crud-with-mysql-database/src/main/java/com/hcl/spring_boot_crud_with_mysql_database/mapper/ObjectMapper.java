package com.hcl.spring_boot_crud_with_mysql_database.mapper;

import com.hcl.spring_boot_crud_with_mysql_database.dto.ProductDto;
import com.hcl.spring_boot_crud_with_mysql_database.entity.Product;

public class ObjectMapper {

	/**
	 * 
	 * map ProductDto Object To Product entity class
	 * 
	 * @param productDto
	 * @return
	 * 
	 */
	public static Product toMapProduct(ProductDto productDto) {

		Product product = new Product();

		product.setId(productDto.getId());
		product.setName(productDto.getName());
		product.setColor(productDto.getColor());
		product.setMfd(productDto.getMfd());
		product.setExpd(productDto.getExpd());
		product.setPrice(productDto.getPrice());

		return product;
	}

	
	/**
	 * 
	 * map Product Object To ProductDto class
	 * 
	 * @param product
	 * @return ProductDto
	 * 
	 */
	public static ProductDto toMapProductDto(Product product) {

		ProductDto productdto = new ProductDto();

		productdto.setId(product.getId());
		productdto.setName(product.getName());
		productdto.setColor(product.getColor());
		productdto.setMfd(product.getMfd());
		productdto.setExpd(product.getExpd());
		productdto.setPrice(product.getPrice());
		
		return productdto;
	}
}

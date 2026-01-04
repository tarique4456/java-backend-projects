package com.tcs.springboot_crud_with_mysql_database.mapper;

import java.util.ArrayList;
import java.util.List;

import com.tcs.springboot_crud_with_mysql_database.dto.ProductDTO;
import com.tcs.springboot_crud_with_mysql_database.entity.Product;

public class ObjectMapper {
	
	// DTO -> Entity(for Insert and update )
	
	public static Product toMapProduct(ProductDTO productDto) {
		
		Product product=new Product();
		
		//DTO se Data Uthake Entity me dal rahe hai
		product.setId(productDto.getId());
		product.setName(productDto.getName());
		product.setColor(productDto.getColor());
		product.setPrice(productDto.getPrice());
		product.setMfd(productDto.getMfd());
		product.setExpd(productDto.getExpd());
		
		return product;
	}
	
	//Entity -> DTO(GET)
	public static ProductDTO toMapProductDto(Product product) {
		
		ProductDTO productDto=new ProductDTO();
		
		productDto.setId(product.getId());
		productDto.setName(product.getName());
		productDto.setColor(product.getColor());
		productDto.setPrice(product.getPrice());
		productDto.setMfd(product.getMfd());
		productDto.setExpd(product.getExpd());
		return productDto;
	}
	
	// List<Entity> -> List<DTO> (GETALL)
	public static List<ProductDTO> toMapAllProductDto(List<Product>products){
		
		List<ProductDTO>productDtoList=new ArrayList<>();
		
		for(Product product:products) {
			productDtoList.add(toMapProductDto(product));
		}
		return productDtoList;
	}
	

}






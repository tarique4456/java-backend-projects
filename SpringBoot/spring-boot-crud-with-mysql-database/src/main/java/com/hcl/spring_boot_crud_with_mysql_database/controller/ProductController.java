package com.hcl.spring_boot_crud_with_mysql_database.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.spring_boot_crud_with_mysql_database.dao.ProductDao;
import com.hcl.spring_boot_crud_with_mysql_database.dto.ProductDto;
import com.hcl.spring_boot_crud_with_mysql_database.entity.Product;
import com.hcl.spring_boot_crud_with_mysql_database.mapper.ObjectMapper;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductDao productDao;

	@GetMapping("/getHome")
	public String home() {
		return "Welcome to Product Management System";
	}

	@RequestMapping(value = "/getDate", method = RequestMethod.GET)
	public String getTodaysDate() {

		return LocalDate.now().toString();
	}

	@GetMapping(value = "/getSum/{a}/{b}")
	public int getSumOfTwoNumbers(@PathVariable(name = "a") int a, @PathVariable(name = "b") int b) {
		return a + b;
	}

	/**
	 * why we use ResponseEntity?
	 * 
	 * @param product
	 * @return
	 */

	@PostMapping(value = "/saveProduct")
	public ResponseEntity<?> saveProductController(@RequestBody @Validated ProductDto productDto) {

		System.out.println(productDto);

		if (productDto == null) {
			return ResponseEntity.badRequest().body("Product details are not valid");
		}

		Product product1 = ObjectMapper.toMapProduct(productDto);

		Product product2 = productDao.saveProductDao(product1);

		Map<String, Object> responseMap = new HashMap<>();

		if (product2 != null) {

			responseMap.put("Message = ", "Product saved successfully");
			responseMap.put("Data = ", product2);

			return ResponseEntity.accepted().body(responseMap);
		} else {

			responseMap.put("Message = ", "Product not saved");
			responseMap.put("Data = ", product2);

			return ResponseEntity.accepted().body(responseMap);
		}
	}

	@GetMapping(value = "/getProductById/{productId}")
	public ResponseEntity<?> getProductByIdController(@PathVariable(name = "productId") int productId) {

		Product product = productDao.getProductByIdDao(productId);

		Map<String, Object> responseMap = new HashMap<>();

		if (product != null) {

			ProductDto productDto = ObjectMapper.toMapProductDto(product);

			responseMap.put("Data = ", productDto);

			return ResponseEntity.status(HttpStatus.FOUND).body(productDto);

		} else {

			responseMap.put("message = ", "given product id is not found");

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@PostMapping(value = "/saveMultipleProduct")
	public List<Product> saveMultipleProductDao(@RequestBody List<Product> products) {
		return productDao.saveMultipleProductDao(products);
	}
	
	@GetMapping(value = "/findByPrice/{price}")
	public List<Product> findByPriceDao(@PathVariable(name = "price") double price) {
		return productDao.findByPriceDao(price);
	}
	

	@PutMapping(value = "/updateProduct")
	public Product updateProductDao(@RequestBody Product product) {
		return productDao.updateProductDao(product);
	}
	
	@GetMapping(value = "/sortProductByAttributeAsc/{attributeName}")
	public List<Product> sortProductByAttributeAscDao(@PathVariable(name = "attributeName") String attributeName){
		return productDao.sortProductByAttributeAscDao(attributeName);
	}

	@GetMapping(value = "/paginationProduct/{pageNumber}")
	public Page<Product> paginationProductDao(@PathVariable(name = "pageNumber") int pageNumber){
		return productDao.paginationProductDao(pageNumber);
	}
}

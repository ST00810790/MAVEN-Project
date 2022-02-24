package com.suwathi.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.suwathi.product.dto.Product;


public class ProductDAOImplTest {

	@Test
	public void CreateShouldCreateAProduct() {
		ProductDAO dao=new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("its awesome!!!!!");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("Iphone",result.getName());
	}

}

package com.suwathi.product.bo;

import com.suwathi.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	Product findProduct(int id);

}

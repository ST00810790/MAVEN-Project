package com.suwathi.product.bo;

import com.suwathi.product.dao.ProductDAO;
import com.suwathi.product.dao.ProductDAOImpl;
import com.suwathi.product.dto.Product;

public class ProdutcBOImpl implements ProductBO {
	private ProductDAO dao=new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

}

package com.suwathi.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suwathi.product.bo.ProductBO;
import com.suwathi.product.bo.ProdutcBOImpl;
import com.suwathi.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBO bo=new ProdutcBOImpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product Details");
		out.print("Product ID:"+product.getId());
		out.print("Product Name:"+product.getName());
		out.print("Product Description:"+product.getDescription());
		out.print("Product Price:"+product.getPrice());
	}

}

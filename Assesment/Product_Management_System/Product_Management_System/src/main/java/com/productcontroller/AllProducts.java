package com.productcontroller;

import java.io.IOException;
import java.util.List;

import com.dao.ProductDao;
import com.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/allProducts")
public class AllProducts extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductDao dao = new ProductDao();
		List<Product> products = dao.allProducts();
		req.setAttribute("list", products);
		req.getRequestDispatcher("allProducts.jsp").forward(req, resp);
	}
}

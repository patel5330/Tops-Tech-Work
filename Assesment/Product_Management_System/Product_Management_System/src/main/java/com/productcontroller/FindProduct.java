package com.productcontroller;

import java.io.IOException;

import com.dao.ProductDao;
import com.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/findproduct")
public class FindProduct extends HttpServlet {
  
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pid = req.getParameter("pid");
		//System.out.println(pid);
		int id = 0;
		if (!pid.equals(" ")) {
			id = Integer.parseInt(pid);
		}
		
		
		ProductDao dao=new ProductDao();
		Product p = dao.getProductById(id);
		req.setAttribute("product",p );
		req.getRequestDispatcher("updateproduct.jsp").forward(req, resp);
	}
}

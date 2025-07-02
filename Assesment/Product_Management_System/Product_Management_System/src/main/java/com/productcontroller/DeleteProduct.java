package com.productcontroller;

import java.io.IOException;

import com.dao.ProductDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteproduct")
public class DeleteProduct extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pid = req.getParameter("pid");
		System.out.println(pid);
		int id = 0;
		if (!pid.equals(" ")) {
			id = Integer.parseInt(pid);
		}
		
		
		ProductDao dao=new ProductDao();
		int i = dao.deleteProduct(id);
		if(i>0) {
			req.setAttribute("msg", "Delete successfully...");
			req.getRequestDispatcher("allProducts").forward(req, resp);
		}
		
	}
}

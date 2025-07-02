package com.categorycontroller;

import java.io.IOException;

import com.dao.CategoryDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deletecategory")
public class DeleteCategory extends HttpServlet {
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		int id = Integer.parseInt(req.getParameter("cid"));
		CategoryDao dao=new CategoryDao();
		int i = dao.deleteById(id);
		if(i>0) {
			req.setAttribute("delete", "Delete Category");
			req.getRequestDispatcher("allCategory").forward(req, resp);
			
		}
	}
}

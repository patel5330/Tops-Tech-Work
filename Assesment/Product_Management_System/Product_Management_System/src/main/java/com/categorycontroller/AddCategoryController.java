package com.categorycontroller;

import java.io.IOException;

import com.dao.CategoryDao;
import com.model.Category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/saveCategory")
public class AddCategoryController extends HttpServlet {
  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cat = req.getParameter("categoryName");
		
		Category c=new Category();
		c.setCategoryName(cat);
		
		CategoryDao dao=new CategoryDao();
		int i = dao.addCategory(c);
		if(i>0) {
			req.setAttribute("msg", "Category add Successfully");
			req.getRequestDispatcher("category.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "Check details not add on Category");
			req.getRequestDispatcher("category.jsp").forward(req, resp);
		}
		
	}
}

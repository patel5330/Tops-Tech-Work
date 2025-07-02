package com.categorycontroller;

import java.io.IOException;

import com.dao.CategoryDao;
import com.model.Category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updatecategory")
public class UpdateCategory extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("categoryId"));
		String cat = req.getParameter("categoryName");

		Category c = new Category();
		c.setCatid(id);
		c.setCategoryName(cat);

		CategoryDao dao = new CategoryDao();
		int i = dao.updateByCategory(c);
		if (i > 0) {
			req.setAttribute("msg", "Update Successfully");
			req.getRequestDispatcher("category.jsp").forward(req, resp);
		} else {
			req.setAttribute("msg", "Check details not Update on Category");
			req.getRequestDispatcher("category.jsp").forward(req, resp);
		}
	}
}

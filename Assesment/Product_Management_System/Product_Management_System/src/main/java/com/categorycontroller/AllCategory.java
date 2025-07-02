package com.categorycontroller;

import java.io.IOException;
import java.util.List;

import com.dao.CategoryDao;
import com.model.Category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/allCategory")
public class AllCategory extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		CategoryDao dao = new CategoryDao();
		List<Category> cat = dao.allCategory();
		req.setAttribute("list", cat);
		req.getRequestDispatcher("allcategory.jsp").forward(req, resp);
		req.getRequestDispatcher("addproduct.jsp").forward(req, resp);
	}
}

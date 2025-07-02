package com.categorycontroller;

import java.io.IOException;

import com.dao.CategoryDao;
import com.model.Category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/find")
public class FindCategory extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String catid = req.getParameter("cid");
		System.out.println(catid);
		int id = 0;
		if (!catid.equals(" ")) {
			id = Integer.parseInt(catid);
		}
		
		System.out.println(id);

		CategoryDao dao = new CategoryDao();
		Category cid = dao.findById(id);
		System.out.println(cid.getCatid() + " " + cid.getCategoryName());

		req.setAttribute("cat", cid);
		req.getRequestDispatcher("updatecategory.jsp").forward(req, resp);
	}
}

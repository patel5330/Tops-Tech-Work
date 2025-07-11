package com.productcontroller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import com.dao.ProductDao;
import com.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/updateProduct")
@MultipartConfig
public class UpdateProduct extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pid = req.getParameter("productId");
		System.out.println(pid);
		int id = 0;
		if (!pid.equals(" ")) {
			id = Integer.parseInt(pid);
		}
		
		String pname = req.getParameter("pname");
		String category = req.getParameter("category");
		String model = req.getParameter("model");
		String price = req.getParameter("price");
		String description = req.getParameter("desc");
		Part part = req.getPart("image");

		String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		String filenametoStore = System.currentTimeMillis() + "_" + filename;
		String path = req.getServletContext().getRealPath("") + File.separator + "img";

		File f = new File(path);
		if (!f.exists()) {
			f.mkdir();
		}

		part.write(path + File.separator + filenametoStore);

		Product p = new Product();
		p.setPid(id);
		p.setPname(pname);
		p.setProductCategory(category);
		p.setModel(model);
		p.setPrice(Integer.parseInt(price));
		p.setDescription(description);
		p.setImage(filenametoStore);

		ProductDao dao = new ProductDao();
		int i = dao.updateProduct(p);
		if(i>0) {
			req.setAttribute("msg", "Update Product Successfully");
			req.getRequestDispatcher("addproduct.jsp").forward(req, resp);
		}
	}
}

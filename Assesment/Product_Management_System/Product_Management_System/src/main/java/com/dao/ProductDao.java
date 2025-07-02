package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.util.DbConnection;

public class ProductDao {

	Connection cn = null;

	public ProductDao() {
		cn = DbConnection.getConnection();
	}

	public int addProduct(Product p) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into product values(?,?,?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, p.getPname());
			ps.setString(3, p.getProductCategory());
			ps.setString(4, p.getModel());
			ps.setInt(5, p.getPrice());
			ps.setString(6, p.getDescription());
			ps.setString(7, p.getImage());
			i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public List<Product> allProducts() {
		List<Product> pi = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setProductCategory(rs.getString(3));
				p.setModel(rs.getString(4));
				p.setPrice(rs.getInt(5));
				p.setDescription(rs.getString(6));
				p.setImage(rs.getString(7));
				pi.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pi;

	}
	
	 public Product getProductById(int id) {
	        Product p = null;
	        try {
	            PreparedStatement ps = cn.prepareStatement("SELECT * FROM product WHERE id = ?");
	            ps.setInt(1, id);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                p = new Product();
	                p.setPid(rs.getInt("id"));
	                p.setPname(rs.getString("pname"));
	                p.setProductCategory(rs.getString("category"));
	                p.setModel(rs.getString("model"));
	                p.setPrice(rs.getInt("price"));
	                p.setDescription(rs.getString("description"));
	                p.setImage(rs.getString("image"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return p;
	    }

	    // Update Product
	    public int updateProduct(Product p) {
	        int i = 0;
	        try {
	            PreparedStatement ps = cn.prepareStatement("UPDATE product SET pname=?, category=?, model=?, price=?, description=?, image=? WHERE id=?");
	            ps.setString(1, p.getPname());
	            ps.setString(2, p.getProductCategory());
	            ps.setString(3, p.getModel());
	            ps.setInt(4, p.getPrice());
	            ps.setString(5, p.getDescription());
	            ps.setString(6, p.getImage());
	            ps.setInt(7, p.getPid());
	            i = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return i;
	    }

	    // Delete Product
	    public int deleteProduct(int id) {
	        int i = 0;
	        try {
	            PreparedStatement ps = cn.prepareStatement("DELETE FROM product WHERE id = ?");
	            ps.setInt(1, id);
	            i = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return i;
	    }

}

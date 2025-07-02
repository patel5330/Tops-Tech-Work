package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Category;
import com.util.DbConnection;

public class CategoryDao {

	Connection cn = null;

	public CategoryDao() {
		cn = DbConnection.getConnection();
	}

	public int addCategory(Category c) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into category values(?,?)");
			ps.setInt(1, 0);
			ps.setString(2, c.getCategoryName());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public List<Category> allCategory() {
		List<Category> list = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from category");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Category c = new Category();
				c.setCatid(rs.getInt(1));
				c.setCategoryName(rs.getString(2));
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public Category findById(int id) {
		Category c = null;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from category where cid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c = new Category();
				c.setCatid(rs.getInt(1));
				c.setCategoryName(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;

	}

	public int deleteById(int id) {
		int i = 0;

		try {
			PreparedStatement ps = cn.prepareStatement("delete from category where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	public int updateByCategory(Category c) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("update category set cname=? where cid=?");
			ps.setString(1, c.getCategoryName());
			ps.setInt(2, c.getCatid());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}

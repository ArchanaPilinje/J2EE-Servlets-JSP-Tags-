package com.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dao.ProductDAO;
import com.model.Category;
import com.model.Product;
import com.utility.ConnectionUtility;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public int save(Product p) {
		try {
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement("INSERT INTO product values(?,?,?,?,?,?)");
			st1.setInt(1,p.getProductID());
			st1.setInt(2,p.getCategoryID());
			st1.setString(3,p.getProductName());
			st1.setInt(4,p.getCostPrice());
			st1.setInt(5,p.getSalePrice());
			st1.setString(6,p.getProductdescription());
			return st1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	
	}

	@Override
	public int update(int productID, String name) {
		try {
			String sqlUpdate = "UPDATE product "
	                + "SET product_name = ? "
	                + "WHERE product_id = ?";
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement(sqlUpdate);
			st1.setString(1,name);
			st1.setInt(2,productID);
			return st1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int productID) {
		try {
			String sqlDelete = "DELETE from product "
	                + "WHERE product_id = ?";
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement(sqlDelete);
			st1.setInt(1,productID);
			return st1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<Product> showAllProducts() {
		ArrayList<Product> product= new ArrayList<>();

		try {
			Statement st = ConnectionUtility.getCon().createStatement();
			ResultSet rs = st.executeQuery("SELECT * from product");
			while (rs.next()) {
				Product p=new Product();
				p.setProductID(rs.getInt(1));
				p.setCategoryID(rs.getInt(2));
				p.setProductName(rs.getString(3));
				p.setCostPrice(rs.getInt(4));
				p.setSalePrice(rs.getInt(5));
				p.setProductdescription(rs.getString(6));
				product.add(p);
				
			}
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product showProductByID(int productID) {
		try {
			Product p=new Product();
			String sqlShow = "Select * from product "
	                + "WHERE product_id = ?";
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement(sqlShow);
			st1.setInt(1,productID);
			ResultSet rs1=st1.executeQuery();
			while(rs1.next()){
				p.setProductID(rs1.getInt(1));
				p.setCategoryID(rs1.getInt(2));
				p.setProductName(rs1.getString(3));
				p.setCostPrice(rs1.getInt(4));
				p.setSalePrice(rs1.getInt(5));
				p.setProductdescription(rs1.getString(6));
			}
			return p;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}

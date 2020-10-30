package com.dao;
import java.util.ArrayList;


import com.model.Product;
public interface ProductDAO {
	int save(Product p);

	int update(int productID,String name);

	int delete(int productID);

	ArrayList<Product> showAllProducts();

	Product showProductByID(int productID);
}

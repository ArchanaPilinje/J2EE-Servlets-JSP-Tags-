package com.model;

public class Product {
int productID;
int categoryID;
String productName;
int costPrice;
int salePrice;
String productdescription;
public Product() {
}
public Product(int productID, int categoryID, String productName, int costPrice, int salePrice,
		String productdescription) {
	this.productID = productID;
	this.categoryID = categoryID;
	this.productName = productName;
	this.costPrice = costPrice;
	this.salePrice = salePrice;
	this.productdescription = productdescription;
}
public int getProductID() {
	return productID;
}
public void setProductID(int productID) {
	this.productID = productID;
}
public int getCategoryID() {
	return categoryID;
}
public void setCategoryID(int categoryID) {
	this.categoryID = categoryID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getCostPrice() {
	return costPrice;
}
public void setCostPrice(int costPrice) {
	this.costPrice = costPrice;
}
public int getSalePrice() {
	return salePrice;
}
public void setSalePrice(int salePrice) {
	this.salePrice = salePrice;
}
public String getProductdescription() {
	return productdescription;
}
public void setProductdescription(String productdescription) {
	this.productdescription = productdescription;
}
@Override
public String toString() {
	return "Product [productID=" + productID + ", categoryID=" + categoryID + ", productName=" + productName
			+ ", costPrice=" + costPrice + ", salePrice=" + salePrice + ", productdescription=" + productdescription
			+ "]";
}

}

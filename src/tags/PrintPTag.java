package tags;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.dao.impl.ProductDAOImpl;
import com.model.Product;

public class PrintPTag extends SimpleTagSupport {
	ProductDAOImpl impl = new ProductDAOImpl();
	ArrayList<Product> list = impl.showAllProducts();
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.println("<table>\r\n"
				+ "		<tr>\r\n"
				+ "			<th>PRODUCT ID</th>\r\n"
				+ "			<th>CATEGORY ID</th>\r\n"
				+ "			<th>PRODUCT NAME</th>\r\n"
				+ "			<th>COST PRICE</th>\r\n"
				+ "			<th>SALE PRICE</th>\r\n"
				+ "			<th>CATEGORY DESCRIPTION</th>\r\n"
				+ "			<th></th>\r\n"
				+ "		</tr>");
		for (Product prod : list) {
			out.println("<tr>\r\n"
					+ "			<td>"+prod.getProductID()+"</td>\r\n"
					+ "			<td>"+prod.getCategoryID()+"</td>\r\n"
					+ "			<td>"+prod.getProductName()+"</td>\r\n"
					+ "			<td>"+prod.getCostPrice()+"</td>\r\n"
					+ "			<td>"+prod.getSalePrice()+"</td>\r\n"
					+ "			<td>"+prod.getProductdescription()+"</td>\r\n"
					+ "		</tr>");
		}
		out.println("</table>");
	}

}

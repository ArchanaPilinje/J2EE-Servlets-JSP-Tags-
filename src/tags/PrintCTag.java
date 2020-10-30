package tags;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.dao.impl.CategoryDAOImpl;
import com.model.Category;

public class PrintCTag extends SimpleTagSupport {
	CategoryDAOImpl impl = new CategoryDAOImpl();
	ArrayList<Category> list = impl.showAllCategory();
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.println("<table>\r\n"
				+ "		<tr>\r\n"
				+ "			<th>CATEGORY ID</th>\r\n"
				+ "			<th>CATEGORY NAME</th>\r\n"
				+ "			<th>CATEGORY DESCRIPTION</th>\r\n"
				+ "			\r\n"
				+ "		</tr>");
		for (Category cat : list) {
			out.println("<tr>\r\n"
					+ "			<td>"+cat.getCategoryId()+"</td>\r\n"
					+ "			<td>"+cat.getCategoryName()+"</td>\r\n"
					+ "			<td>"+cat.getDescription()+"</td>\r\n"
					+ "			\r\n"
					+ "		</tr>");
		}
		out.println("</table>");
	}

}

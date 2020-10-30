package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FooterProducts extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.println("<a href=\"index.jsp\">Home</a>|");
		out.println("<a href=\"product.jsp\">CRUD Operation on Product</a>|");
		out.println("<a href=\"addP.jsp\">add</a>|\r\n"
				+ "	<a href=\"updateP.jsp\">update</a>|\r\n"
				+ "	<a href=\"deleteP.jsp\">delete</a>|\r\n"
				+ "	<a href=\"viewP.jsp\">view all</a>|\r\n"
				+ "	<a href=\"searchP.jsp\">search</a>|\r\n"
				+ "	<a href=\"http://localhost:8080/AdminJSP/ControllerServlet?buttonName=logout\">logout</a>|");
	}

}

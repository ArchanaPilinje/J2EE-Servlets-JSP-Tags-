package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FooterCategory extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		out.println("<a href=\"index.jsp\">Home</a>|\r\n"
				+ "<a href=\"category.jsp\">CRUD Operation on Category</a>|\r\n"
				+ "\r\n"
				+ "	<a href=\"addC.jsp\">add</a>|\r\n"
				+ "	<a href=\"updateC.jsp\">update</a>|\r\n"
				+ "	<a href=\"deleteC.jsp\">delete</a>|\r\n"
				+ "	<a href=\"viewC.jsp\">view all</a>|\r\n"
				+ "	<a href=\"searchC.jsp\">search</a>|\r\n"
				+ "	<a href=\"http://localhost:8080/AdminJSP/ControllerServlet?buttonName=logout\">logout</a>|");
	}

}

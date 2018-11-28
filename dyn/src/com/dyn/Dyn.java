package com.dyn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dyn extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date dateref = new Date();
		String currdate1 = dateref.toString();
		String htmlres = "<html>"+"<body>"+"<h1>"+"current date and time is:"+"<font color = \"blue\">"+currdate1+"</font>"+"</h1>"+"</body>"+"</html>";
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.print(htmlres);
	}
}

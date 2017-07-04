package kr.or.connect;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		String name = req.getParameter("name");
		System.out.println(name);
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html><head><title>servlet test</title></head><body>");
		pw.print("안녕하세요 " + name);
		pw.print("</body></html>");
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
}

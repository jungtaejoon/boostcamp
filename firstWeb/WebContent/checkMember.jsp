<%@page import="java.sql.Connection"%>
<%@page import="kr.or.connect.dao.MemberDao"%>
<%@page import="kr.or.connect.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.getMember(name);
		if(dto != null && passwd.equals(dto.getPasswd())) {
			Cookie cookie = new Cookie("loginOk", name);
			cookie.setPath("/");
			cookie.setMaxAge(-1);
			
			response.addCookie(cookie);
			
			response.sendRedirect("view.jsp");
		}

	%>
</body>
</html>
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
	String cookieName = request.getParameter("cookieName");
	String cookieValue = request.getParameter("cookieValue");
	
	Cookie cookie = new Cookie(cookieName, cookieValue);
	cookie.setPath("/"); //인터넷 어플리케이션 내
	cookie.setMaxAge(-1); //브라우져 유지 시까지만
	
	response.addCookie(cookie);
%>

</body>
</html>
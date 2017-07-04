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
	boolean loginFlag = false;
	Cookie[] cookies = request.getCookies();
	for(Cookie cookie : cookies) {
		if("loginOk".equals(cookie.getName())) {
			loginFlag = true;
			out.print(cookie.getValue() + "님 환영합니다.");
			break;
		}
	}
	if(loginFlag) {
		
	} else {
		
	}
%>

</body>
</html>
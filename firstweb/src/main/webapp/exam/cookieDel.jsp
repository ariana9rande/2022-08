<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cookieName = request.getParameter("cookieName");
	Cookie cookie = new Cookie(cookieName,"");
	cookie.setPath("/");
	cookie.setMaxAge(0);
	
	response.addCookie(cookie);
	
	response.sendRedirect("showCookie.jsp");
%>
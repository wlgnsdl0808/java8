<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹 테스트</title>
</head>
<body>
	<h1>웹 테스트 01</h1>
<%
	String DB_URL = "jdbc:mysql://localhost:3306/test";
	String DB_USER = "root";
	String DB_PW = "a1234";
	Connection conn;
	Statement stmt;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
		stmt = conn.createStatement();
		conn.close();
		out.println("MySQL Test ok~!");
	} catch(Exception e){
		out.println(e.getMessage());
	}
%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Credit Success</title>
</head>
<body>
    <h1>Credit Success</h1>
    <p>Amount credited successfully.</p>
    <p>Your current balance is: <%= request.getParameter("balance") %></p>
    <p><a href="ATM.html">Return to Main Page</a></p>
</body>
</html>
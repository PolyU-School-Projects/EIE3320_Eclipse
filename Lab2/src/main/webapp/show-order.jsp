<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Show Order</title>
</head>
<body>
 
<%@page import="bookstore.*" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Date" %>
	
	<%
		// Get the shopping cart object. From the cart object, get the number of books
		// Put your code here
		
		ArrayList<Book> cart = (ArrayList<Book>)session.getAttribute("bookstore.cart");
		int numBooks = cart.size();
		double totalPrice = 0.0;
		for (int i=0; i<numBooks; i++) {
			totalPrice += cart.get(i).getPrice();
		}
	%>
	Student Name: WU Xiaotao<br>
	Student ID: 21097724D<br>
	Student Name: LYU Jiheng<br>
	Student ID: 21106625D<br>
	<br>
	<center>The time now is: <%= new Date() %></center>
	
	<p style="text-align: center;">
		You have <%=numBooks %> item(s) in your shopping cart <br> 
	</p>
	<% if (numBooks > 0) { %>	
		<table align="center" border=1  >
		<tr>
			<th></th>
			<th>Title</th>
			<th>Price</th>
		</tr>
		<% for (int i=0; i<numBooks; i++) { %>
				<tr>
					<td><%=i+1 %></td> 
					<!-- Get the title and price of the i-th book in the shopping cart -->
					<!-- Put your code here -->
					<td><% out.print(cart.get(i).getTitle()); %></td>
					<td><% out.print(cart.get(i).getPrice()); %></td>
				</tr>
		<% } %>
		<tr>
			<td></td>
			<td>Total:</td>
			<!-- Get the total price -->
			<!-- Put your code here -->
			
			<td><%=totalPrice %></td>
			
		</table>
	<% } %>	
	<center>
		<input type="button" value="Back" onClick="JavaScript:window.location='BookInfo.jsp';">
		<input type="button" value="Check Out" onClick="JavaScript:window.location='check-out.jsp';"> &nbsp; &nbsp;
		<input type="button" value="Remove All" onClick="JavaScript:window.location='remove-all.jsp';">
	</center>
	
	
</body>
</html>
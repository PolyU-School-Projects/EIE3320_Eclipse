<html>
<head>
<title>Check Out</title>
<script type="text/JavaScript">

/* When any of the text boxes is blank, display an error message "Missing Name or Credit Card Number". 
	If the input credit card number is not a number, display an error message "Invalid Credit Card Number".
	*/
	//Put your code here
	function validateForm() {
  		var customerName = document.forms["checkout"]["customerName"].value;
  		var cardNumber = document.forms["checkout"]["cardNumber"].value;
  
  		if (customerName === "" || cardNumber === "") {
  		  alert("Missing Name or Credit Card Number");
  		  return false;
 		 }
  
 		if (isNaN(cardNumber)) {
  		  alert("Invalid Credit Card Number");
  		  return false;
 		 }
 		return true;
	}

</script>
</head>
<body>
<%@page import="bookstore.*" %>
<%@page import="java.util.ArrayList" %>

	<%
		// Get the ShoppingCart object through the session attribute.
		// Put your code here
		ArrayList<Book> cart = (ArrayList<Book>)session.getAttribute("bookstore.cart");
		int numBooks = cart.size();
		
		// Compute the total price of all books in the shopping cart
		double total = 0.0;
		for (int i=0; i<numBooks; i++) {
			total += cart.get(i).getPrice();
		}
	%>
	Your total purchase is: <%=total %> <p></p>
	To purchase the item in your shopping cart, please provide us the following information:
	
	<form name="checkout" method="post" action="ReceiptServlet" onsubmit="return validateForm()">
	<b>Name: </b> <input type="text" name="customerName" size=20 value="WU Xiaotao"><br>
	<b>Credit Card Number</b><input type="text" name="cardNumber" size=16 value="21097724D"> <br>
	<input type="submit" value="Submit Information"> &nbsp; &nbsp; 
	<input type="button" value="Cancel" onClick="JavaScript:window.location='show-order.jsp';">
	</form>	
	
</body>
</html>
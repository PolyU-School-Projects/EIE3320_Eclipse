package bookstore;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/show-order.jsp";
		ShoppingCart cart;
		ArrayList<Book> books;
		
		// Get the session object, make sure that the user cannot access this servlet directly
		// If the user attempts to access this servlet directly, forward the user to SearchBook.html.
		/* Put your code here */
		  	
		
		// Get the ShoppingCart object (namely cart) from the session attribute "bookstore.cart". 
		// If cart is null, create a new ShoppingCart object.
		// Set the session attribute by associating the String "bookstore.cart" with the newly created object.
		/* Put your code here */

		// Get the ArrayList object (namely books) from the session attribute ˇ§foundBooksˇ¨. 
		// This ArrayList object, which was created in QueryServlet.class, 
	// contains the book objects that match the search criteria specified in SearchBook.html
		/* Put your code here */
		
		// Get the index of the selected book from BookInfo.jsp
		/* Put your code here */
		
		// Add the selected book object to the Shopping cart 
	// Set the cart to session attribute
		/* Put your code here */
		
		// Forward the control to either show-order.jsp or SearchBook.html
		/* Put your code here */

	}

}

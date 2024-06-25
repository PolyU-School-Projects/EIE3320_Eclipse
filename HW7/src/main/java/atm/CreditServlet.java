package atm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreditServlet
 */
@WebServlet("/credit")
public class CreditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();

        // Retrieve the current balance from the session
        int balance = (int) session.getAttribute("balance");


        
        // Forward the request to the creditSuccess.jsp page
        RequestDispatcher dispatcher = request.getRequestDispatcher("creditSuccess.jsp");
        dispatcher.forward(request, response);
     
        
        
  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int amount = Integer.parseInt(request.getParameter("Amount"));

        // Retrieve the current balance from the session
        int balance = (int) session.getAttribute("balance");

        // Credit the amount to the balance
        balance += amount;

        // Update the balance in the session
        session.setAttribute("balance", balance);

        // Redirect the user to a page or display the balance
        response.sendRedirect("creditSuccess.jsp?balance=" + balance);
    }

}

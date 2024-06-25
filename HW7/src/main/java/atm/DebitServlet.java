package atm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DebitServlet
 */
@WebServlet("/debit")
public class DebitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DebitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int amount = Integer.parseInt(request.getParameter("Amount"));

     // Retrieve the current balance from the session
        Integer balanceInteger = (Integer) session.getAttribute("balance");
        int balance;
        if (balanceInteger == null) {
            // If the balance attribute is not set, initialize it with a default value
            balance = 200;
        } else {
            // If the balance attribute is set, retrieve its value
            balance = balanceInteger.intValue();
        }

        // Check if the account has sufficient balance for the debit
        if (balance >= amount) {
            // Debit the amount from the balance
            balance -= amount;

            // Update the balance in the session
            session.setAttribute("balance", balance);

           
            // Redirect the user to a page or display the balance
            response.sendRedirect("debitSuccess.jsp?balance=" + balance);
        } else {
            // Redirect the user to an error page or display an error message
            response.sendRedirect("insufficientBalance.jsp");
        }
 
    }

}

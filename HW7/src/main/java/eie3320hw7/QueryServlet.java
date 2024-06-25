package eie3320hw7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class QueryServlet
 */
@WebServlet("/show-result.jsp")
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String authorID = "1";
	String fullname = "Blank";       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet is being called!");
		request.setAttribute("authorID", "1");
        request.setAttribute("fullname", "Tim");
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/show-result.jsp");
        dispatcher.forward(request, response);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Author ID: 1</h2>");
        out.println("<h2>Full Name: Tim</h2>");
        out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		



	}
}

package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;
import service.SearchService;

/**
 * Servlet implementation class BinServlet
 */
@WebServlet("/BinServlet")
public class BinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 String unumber =(String) session.getAttribute("unumber");

		 User user=new User(unumber);
		 SearchService service=new SearchService();
		 List<User> list = service.searchBin(user);
	
		 request.setAttribute("list", list);
		 request.getRequestDispatcher("searchBin.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

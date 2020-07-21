package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.SearchService;

/**
 * Servlet implementation class SearchByMHUExcel
 */
@WebServlet("/SearchByMHUExcel")
public class SearchByMHUExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String uname = request.getParameter("uname");
		SearchService s=new SearchService();
		List<User> list = s.searchByMH(uname);
//		System.out.println(list.size());
		request.setAttribute("list", list);
//		request.getRequestDispatcher("search_admin.jsp").forward(request, response);
		request.getRequestDispatcher("excelexport.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

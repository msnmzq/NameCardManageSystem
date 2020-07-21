package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;
import service.AddService;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8"); 
		HttpSession session = request.getSession();
		  String unumber =(String) session.getAttribute("unumber");
		  String upassword =(String) session.getAttribute("upassword");
		 String name = request.getParameter("name");
		 String sex = request.getParameter("sex");
		 String email = request.getParameter("email");
		 String profession = request.getParameter("profession");
		User user=new User(unumber,upassword,name,sex,email,profession,"普通用户");
		AddService service =new AddService();
		int add=service.add(user);
		if(add==1) {
			//添加成功
			request.getRequestDispatcher("addSuccess.jsp").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

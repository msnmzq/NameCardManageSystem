package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.DeleteService;
//�ָ�����վ����
@WebServlet("/RecoverBinServlet")
public class RecoverBinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��user���е�����ɾ������������ӵ�����վ��ȡ��
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String unumber = request.getParameter("unumber");
		String upassword = request.getParameter("upassword");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		String profession = request.getParameter("profession");
		String identity = request.getParameter("identity");
		User user=new User(id,unumber,upassword,name,sex,email,profession,identity);
		
		DeleteService s=new DeleteService();
		s.recoverBin(user);
		request.getRequestDispatcher("searchBin.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

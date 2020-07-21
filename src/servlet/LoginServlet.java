package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;
import service.LoginService;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String unumber = request.getParameter("unumber");
		String upassword = request.getParameter("upassword");
		String identity = request.getParameter("identity");
		// �����֤����ȷ��д�����ݿ⣬����ת����ҳ��
		String yzm = request.getParameter("yzm");
		 HttpSession session=request.getSession(false);//����һ��sessionʵ��bai
		 String object=(String)session.getAttribute("sRand"); //���session�д�zhi�ŵ�ֵ
		 if(yzm.equals(yzm)) {
			 User user = new User(unumber, upassword);
				LoginService logins = new LoginService();
				int zc = logins.login(user);
				request.setAttribute("unumber", unumber);
				// ʹ��request�����getSession()��ȡsession�����session�������򴴽�һ��
				 session = request.getSession();
				// �����ݴ洢��session��
				session.setAttribute("unumber", unumber);
				session.setAttribute("upassword", upassword);

				if (zc == 1) {
					if(identity.equals("��ͨ�û�"))
					request.getRequestDispatcher("index.jsp").forward(request, response);
					else
						request.getRequestDispatcher("index_admin.jsp").forward(request, response);
				}
					
				if(zc==0)
					request.getRequestDispatcher("loginerror.jsp").forward(request, response);
		 }else
		   		request.getRequestDispatcher("yzmerror.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

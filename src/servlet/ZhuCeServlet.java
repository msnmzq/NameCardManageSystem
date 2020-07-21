package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;
import service.ZCService;


@WebServlet("/ZhuCeServlet")
public class ZhuCeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		String uname = request.getParameter("unumber");
		String upassword = request.getParameter("upassword");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		String profession = request.getParameter("profession");
		String identity = request.getParameter("identity");
		//如果验证码正确，写入数据库，并跳转到主页面
		String yzm = request.getParameter("yzm");
		 HttpSession session=request.getSession(false);//创建一个session实例bai
		 String object=(String)session.getAttribute("sRand"); //获得session中存zhi放的值
//	   	System.out.println("obj="+object);		
//		System.out.println(object.equals(yzm));
	   	if(object.equals(yzm)) {
	   		User user=new User(uname,upassword,name,sex,email,profession,identity);
			ZCService service=new ZCService();
			int zc = service.zc(user);
			if(zc==0)
			request.getRequestDispatcher("success.jsp").forward(request, response);
			if(zc==1)
				request.getRequestDispatcher("error.jsp").forward(request, response);
	   	}else
	   		request.getRequestDispatcher("yzmerror.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

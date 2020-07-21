package servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.AddService;
import utils.ReadExcel;

/**
 * Servlet implementation class ExcelToDB
 */
@WebServlet("/ExcelToDB")
public class ExcelToDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String UPLOAD_DIRECTORY = "upload";
		String uploadPath = getServletContext().getRealPath("/") + File.separator + UPLOAD_DIRECTORY;
		String fileName = (String) request.getAttribute("fileName");
		File file = new File(uploadPath + "/" + fileName);

		String[][] result = ReadExcel.getData(file, 1);

		int rowLength = result.length;// 处理数据：数据存储在二维数组中，是rowLength行，result[i].lenth列。
		List<User> list = new ArrayList<User>();
		// 每一行是一个user,将user对象传递给
		if (rowLength > 0) {// 表中有数据
			String[] s = new String[result[0].length];
			for (int i = 0; i < rowLength; i++) {

				for (int j = 0; j < result[i].length; j++) {
					s[j]=result[i][j];
				}
				User user=new User(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);
				list.add(user);


			}
		}
		AddService addService = new AddService();
		addService.add(rowLength,list);
		request.getRequestDispatcher("dbSucc.jsp").forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}

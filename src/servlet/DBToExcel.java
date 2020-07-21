package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Servlet implementation class DBToExcel
 */
@WebServlet("/DBToExcel")
public class DBToExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/vnd.ms-excel");//响应正文的MIME类型，表示Excel

        //String filePath="d:\\demo.xls";//设置文件路径
		String id = request.getParameter("id");
		String unumber = request.getParameter("unumber");
		String upassword = request.getParameter("upassword");
        String name = request.getParameter("name");



        String sex = request.getParameter("sex");

        String email = request.getParameter("email");
        String profession = request.getParameter("profession");
        

       ServletOutputStream out = response.getOutputStream();//响应输出流对象
       // FileOutputStream out = new FileOutputStream(filePath);//创建FileoutputStream对象
       // wb.write(out);  //将文件保存在对应的文件中
        HSSFWorkbook wb = new HSSFWorkbook();             //创建Excel表格

        HSSFSheet  sheet = wb.createSheet("用户名片信息");//创建工作簿

        sheet.setColumnWidth(100, 10000);                          //设置列宽

        HSSFRow titleRow = sheet.createRow(0);            //创建Excel中的标题行

        HSSFCell titleCell1 =titleRow .createCell(0);          //在行中创建第1个单元格

        titleCell1.setCellValue("id");               //设置第1个单元格的值

        HSSFCell titleCell2= titleRow.createCell(1);           //在行中创建第2个单元格

        titleCell2.setCellValue("unumber");                      //设置第2个单元格的值

        HSSFCell titleCell3 =titleRow .createCell(2);          //在行中创建第3个单元格

        titleCell3.setCellValue("upassword");                      //设置第3个单元格的值
        

        HSSFCell titleCell4= titleRow.createCell(3);           //在行中创建第4个单元格

        titleCell4.setCellValue("name");                      //设置第4个单元格的值
        
        HSSFCell titleCell5= titleRow.createCell(4);           //在行中创建第4个单元格

        titleCell5.setCellValue("sex");                      //设置第4个单元格的值
        HSSFCell titleCell6= titleRow.createCell(5);           //在行中创建第4个单元格

        titleCell6.setCellValue("email");                      //设置第4个单元格的值
        HSSFCell titleCell7= titleRow.createCell(6);           //在行中创建第4个单元格

        titleCell4.setCellValue("profession");                      //设置第4个单元格的值

        
        
        HSSFRow valueRow = sheet.createRow(1); 
        
        //创建第2行

        HSSFCell nameCell = valueRow.createCell(0);              //在第2行中创建单元格

        nameCell.setCellValue(id);

        HSSFCell pwdCell = valueRow.createCell(1);

        pwdCell.setCellValue(unumber);

        HSSFCell sexCell = valueRow.createCell(2);

        sexCell.setCellValue(upassword);

        HSSFCell ageCell = valueRow.createCell(3);

        ageCell.setCellValue(name);
        
        
      

        HSSFCell nameCell1 = valueRow.createCell(4);              //在第2行中创建单元格

        nameCell1.setCellValue(sex);

        HSSFCell pwdCell1 = valueRow.createCell(5);

        pwdCell1.setCellValue(email);

        HSSFCell sexCell1 = valueRow.createCell(6);

        sexCell1.setCellValue(profession);


        HSSFCellStyle cellStyle = wb.createCellStyle();

        wb.write(out);                              //将响应流输入到Excel表格中
        response.addHeader("Content-Disposition", "attachment;filename=demo.xls");//文件临时保存在demo.xls中
        out.flush();

        out.close();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

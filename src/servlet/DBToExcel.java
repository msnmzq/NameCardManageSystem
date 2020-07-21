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
		response.setContentType("application/vnd.ms-excel");//��Ӧ���ĵ�MIME���ͣ���ʾExcel

        //String filePath="d:\\demo.xls";//�����ļ�·��
		String id = request.getParameter("id");
		String unumber = request.getParameter("unumber");
		String upassword = request.getParameter("upassword");
        String name = request.getParameter("name");



        String sex = request.getParameter("sex");

        String email = request.getParameter("email");
        String profession = request.getParameter("profession");
        

       ServletOutputStream out = response.getOutputStream();//��Ӧ���������
       // FileOutputStream out = new FileOutputStream(filePath);//����FileoutputStream����
       // wb.write(out);  //���ļ������ڶ�Ӧ���ļ���
        HSSFWorkbook wb = new HSSFWorkbook();             //����Excel���

        HSSFSheet  sheet = wb.createSheet("�û���Ƭ��Ϣ");//����������

        sheet.setColumnWidth(100, 10000);                          //�����п�

        HSSFRow titleRow = sheet.createRow(0);            //����Excel�еı�����

        HSSFCell titleCell1 =titleRow .createCell(0);          //�����д�����1����Ԫ��

        titleCell1.setCellValue("id");               //���õ�1����Ԫ���ֵ

        HSSFCell titleCell2= titleRow.createCell(1);           //�����д�����2����Ԫ��

        titleCell2.setCellValue("unumber");                      //���õ�2����Ԫ���ֵ

        HSSFCell titleCell3 =titleRow .createCell(2);          //�����д�����3����Ԫ��

        titleCell3.setCellValue("upassword");                      //���õ�3����Ԫ���ֵ
        

        HSSFCell titleCell4= titleRow.createCell(3);           //�����д�����4����Ԫ��

        titleCell4.setCellValue("name");                      //���õ�4����Ԫ���ֵ
        
        HSSFCell titleCell5= titleRow.createCell(4);           //�����д�����4����Ԫ��

        titleCell5.setCellValue("sex");                      //���õ�4����Ԫ���ֵ
        HSSFCell titleCell6= titleRow.createCell(5);           //�����д�����4����Ԫ��

        titleCell6.setCellValue("email");                      //���õ�4����Ԫ���ֵ
        HSSFCell titleCell7= titleRow.createCell(6);           //�����д�����4����Ԫ��

        titleCell4.setCellValue("profession");                      //���õ�4����Ԫ���ֵ

        
        
        HSSFRow valueRow = sheet.createRow(1); 
        
        //������2��

        HSSFCell nameCell = valueRow.createCell(0);              //�ڵ�2���д�����Ԫ��

        nameCell.setCellValue(id);

        HSSFCell pwdCell = valueRow.createCell(1);

        pwdCell.setCellValue(unumber);

        HSSFCell sexCell = valueRow.createCell(2);

        sexCell.setCellValue(upassword);

        HSSFCell ageCell = valueRow.createCell(3);

        ageCell.setCellValue(name);
        
        
      

        HSSFCell nameCell1 = valueRow.createCell(4);              //�ڵ�2���д�����Ԫ��

        nameCell1.setCellValue(sex);

        HSSFCell pwdCell1 = valueRow.createCell(5);

        pwdCell1.setCellValue(email);

        HSSFCell sexCell1 = valueRow.createCell(6);

        sexCell1.setCellValue(profession);


        HSSFCellStyle cellStyle = wb.createCellStyle();

        wb.write(out);                              //����Ӧ�����뵽Excel�����
        response.addHeader("Content-Disposition", "attachment;filename=demo.xls");//�ļ���ʱ������demo.xls��
        out.flush();

        out.close();

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

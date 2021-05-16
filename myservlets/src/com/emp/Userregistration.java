package com.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.dao.PersonDao;

/**
 * Servlet implementation class Userregistration
 * @param <Person>
 */
@WebServlet("/Userregistration")
public class Userregistration<Person> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 PersonDao personDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userregistration() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
        personDao = new PersonDao();
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        List<com.emp.model.Person> list =personDao.listPerson();
        pw.println("<html> <head> <style type=text/css>");
        pw.println("table {width: 50%;border-collapse: collapse;");
            pw.println("background-color: wheat;border-spacing: 10px;}");

 

       pw.println( "TABLE, TR, TD {border: 1px solid blue;}");

 

        pw.println("th, td {padding: 20px;}");
        pw.println("</style> </head><body>");
            pw.println("<form action=#>");
                pw.println("<h1 style=background-color: maroon; color: white; padding: 20px;");
                pw.println(" text-align: center;>listPerson</h1>");
                pw.println("<table align=center>");
                pw.println("</tr>");
                for(com.emp.model.Person person:list){
                    com.emp.model.Person p = null;
					int num=p.getPid();
                    pw.println("<td>"+num+"</td>");
                    pw.println("<td>"+p.getEname()+"</td>");
                    pw.println("<td>"+p.getContactno()+"</td>");
                    pw.println("<td>"+p.getEmail()+"</td>");
                    pw.println("<td>"+p.getGender()+"</td>");
                    pw.println("<td>"+p.getAddress()+"</td>");
                    pw.println("<td><a href=DelServlet?no="+num+">delete</a></td>");
                    pw.println("/tr>");
                }
                pw.println("</table></form></body></html>");
        
               
    }



}
 

	
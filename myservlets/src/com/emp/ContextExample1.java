package com.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextExample1
 */
@WebServlet("/ContextExample1")
public class ContextExample1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
   ServletContext context = null;
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        context = config.getServletContext();
    }

 

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        context.setAttribute("goldrate", "45000.00");
        pw.println("<h3 style=color:green> Gold Rate :"+context.getAttribute("goldrate"));
        pw.println("servlet version ="+context.getMajorVersion()+"."+context.getMajorVersion()+"</h3>");
        
    }

 

}

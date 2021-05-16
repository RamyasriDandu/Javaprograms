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
 * Servlet implementation class ContextExample2
 */
@WebServlet("/ContextExample2")

    public class ContextExample2 extends HttpServlet {
        private static final long serialVersionUID = 1L;
           
        
        ServletContext context = null;
        public void init(ServletConfig config) throws ServletException {
            context=config.getServletContext();
        }

     
        
        protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            pw.println("<h3 style=color:red> Goldrate:"+context.getAttribute("goldrate")+"<h3>");
        }
    }
     

   
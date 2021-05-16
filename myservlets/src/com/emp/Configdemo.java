package com.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Configdemo
 */
@WebServlet(
		urlPatterns = { "/Configdemo" }, 
		initParams = { 
				@WebInitParam(name = "Cnames", value = "JAVA,.NET,PYTHON,TESTING,ORACLE", description = "Register")
		})
public class Configdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String cnames = null;
    public void ConfigDemo() {
       
    }

 

    /**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig config) throws ServletException {
        cnames = config.getInitParameter(cnames);
        
    }

 

    /**
     * @see Servlet#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

 

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    		response.setContentType("text/html");
    		PrintWriter pw = response.getWriter();
    		pw.println("<html><body bgcolor=wheat text = blue><form action=ConfigDemo method=POST>");
    		pw.println("<h1 style= color:maroon>Online courses</h1><hr/>");
    		pw.println("<p> Select course name : </p>");
    		pw.println("<p><select name=cname>");
    		String cn[] = cnames.split(",");
    		for (String x : cn) {
    		pw.println("<option>" + x + "</option>");
    		}
    		pw.println("</select></p><p><input type=submit value=Register></p></form></body></html>");

    		 

    		}
    


    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    		response.setContentType("text/html");
    		PrintWriter pw = response.getWriter();
    		String cs[] = {"JAVA",".NET","TESTING","ORACLE"};
    		double prices[] = {25000.00, 20000.00,15000.00,18000.00};
    		String cname = request.getParameter("cname");
    		int ind=0;
    		for(int i = 0; i<cs.length;i++){
    		if(cname.equalsIgnoreCase(cs[i])){
    		ind = i;
    		}
    		}
    		pw.println("<h1 style= color:green>Your selected couesrname is :"+cname+"<br>");

    		pw.println("You have to pay"+prices[ind]+"Rs only</h1>");
    		pw.println("<h4 style:color:green>Thank you</h4>");

    		}

    		 

    		}
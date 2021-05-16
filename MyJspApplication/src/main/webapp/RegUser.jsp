<%@ page import= "java.sql.*"%>

<%!
Connection con=null;
public void jspInit(){
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(
				"jdbc:mysql://loaclhost:3306/ojasdb","root","root");
		System.out.println("Connected Successfully"+con);
	}
	catch(Exception e){
		System.out.println(e);
	}
}

%>
<%
 try{
	 String name=request.getParameter("uname");
	 String upass=request.getParameter("upass");
	 PreparedStatement pst=con.prepareStatement("insert into user(username,password) values(?,?)");
	 pst.setString(1,name);
	 pst.setString(2,upass);
	 int num=pst.executeUpdate();
	 if(num>0) {
		 out.println(
				 "<h1 style=color:pink>Inserted successfully</h>");
		 
	 }
	 else{
		 out.println("<h1>Try Again</h1>");
	 }
 }
catch(Exception e){
	System.out.println(e);
}


%>


</body>
</html>
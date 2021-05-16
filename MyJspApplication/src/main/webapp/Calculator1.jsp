<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int fno = Integer.parseInt(request.getParameter("fno"));
int sno = Integer.parseInt(request.getParameter("sno"));

String bValue = request.getParameter("b1");
if (bValue.equals("ADD")) {
    out.println("SUM=" + (fno + sno));
} else if (bValue.equalsIgnoreCase("SUB")) {
    out.println("SUB=" + (fno - sno));
} else if (bValue.equalsIgnoreCase("MUL")) {
    out.println("PRODUCT=" + (fno * sno));
} else if (bValue.equalsIgnoreCase("DIV")) {
    out.println("DIVISION=" + (fno / sno));
}
%>

</body>
</html>
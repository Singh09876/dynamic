<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Hello second JSP !!</h1>




	<%
		String fname = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String login = request.getParameter("loginId");
		String pwd = request.getParameter("password");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
	%>

	<%=fname%> <br>
	<%=lname%><br>
	<%=login%><br>
	<%=pwd%><br>
	<%=dob%><br>
	<%=address%><br>

</body>
</html>
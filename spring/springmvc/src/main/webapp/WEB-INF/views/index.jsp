
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>

        <!-- Data send from controller to view using model-->
	<%
		/*String name = (String) request.getAttribute("name");
	 Integer id = (Integer) request.getAttribute("id");*/
	 
	%>
	<h1>
	Name is
	${name }
	<%--<%=name--%>
	</h1>
	
	<h1>
	Id is
	${id }
	<%--<%=id --%>
	</h1>
	
   <h1>
   ${mark }
   </h1>
   
   <h1>
   Friends are
   ${f }
   </h1>
   
   <c:forEach var="item" items="${mark }">
   <h1>${item }</h1></c:forEach>
   
   <c:forEach var="frds" items="${f }">
   <h1>${frds }</h1></c:forEach>
</body>
</html>
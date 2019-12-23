<%@page import="com.company.domain.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.company.DaoImpl.EmployeeDaoImpl"%>
<%@page import="java.util.Iterator"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Register" >
  
<table>
<tr>
<% Employee employee=new Employee(); %>
<td>ID</td>
<td><input type="text" name="id" value=<%=employee.getId()%>></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="ename" value=<%=employee.getName() %>></td>
</tr>
<tr>
<td>Designation</td>
<td><select name="designation" value=<%=employee.getDesignation() %> >
<option name="manager">Manager</option>
<option name="devloper">devloper</option>
</select>
</td>
</tr> 
</tr>
<tr>
<td>Roll no</td>
<td><input type="text" name="roll"></td>
</tr>
<tr>
<td>Date</td>
<td><input type="date" name="date"></td>
</tr>


<tr>
<td><input type="submit" value="ADD"></td>
</tr>


</table>
</form>
</body>
</html>
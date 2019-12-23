package com.company.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.DaoImpl.EmployeeDaoImpl;
import com.company.domain.Employee;

public class EmployeeRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       EmployeeDaoImpl employeeDaoImpl=new EmployeeDaoImpl();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String designation=request.getParameter("designation");
		Integer roll=Integer.parseInt(request.getParameter("roll"));
		Date date=Date.valueOf(request.getParameter("date"));
		
		Employee employee=new Employee(name,designation,roll,date);
			employeeDaoImpl.saveEmployee(employee);
		
	}

}
